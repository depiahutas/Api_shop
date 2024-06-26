package com.loparok.controller;


import com.loparok.configuration.JwtProvider;
import com.loparok.model.Customer;
import com.loparok.repository.CustomerRepository;
import com.loparok.request.LoginRequest;
import com.loparok.response.AuthResponse;
import com.loparok.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomUserDetailsService customUserDetails;

    @Autowired
    private JwtProvider jwtProvider;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/signup")
    public AuthResponse createUser(@RequestBody Customer customer) throws Exception {

        String email = customer.getEmail();
        String password = customer.getPassword();

        Customer isExistEmail = customerRepository.findByEmail(email);
        if(isExistEmail!=null){
            throw new Exception("L'adresse E-mail est déjà utilisé avec un autre compte");
        }

        Customer createdCustomer=new Customer();
        createdCustomer.setEmail(email);
        createdCustomer.setPassword(passwordEncoder.encode(password));

        Customer savedCustomer= customerRepository.save(createdCustomer);

        Authentication authentication = new UsernamePasswordAuthenticationToken(createdCustomer, savedCustomer);

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtProvider.generateToken(authentication);

        AuthResponse res = new AuthResponse();

        res.setJwt(token);
        res.setMessage("Connexion réussie");

        return res;
    }

    @PostMapping("/signin")
    public AuthResponse signinHandler(@RequestBody LoginRequest loginRequest){
        String username = loginRequest.getEmail();
        String password = loginRequest.getPassword();

        Authentication authentication = authenticate(username, password);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtProvider.generateToken(authentication);

        AuthResponse res = new AuthResponse();

        res.setJwt(token);
        res.setMessage("Connexion réussie");

        return res;

    }


    private Authentication authenticate(String username, String password){

        UserDetails userDetails = customUserDetails.loadUserByUsername(username);

        if(userDetails==null){
            throw new BadCredentialsException("Utilisateur non trouvé");
        }
        if(!passwordEncoder.matches(password, userDetails.getPassword())){
            throw new BadCredentialsException("Password incorrect");
        }

        return new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
    }

}
