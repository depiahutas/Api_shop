package com.loparok.service;

import com.loparok.configuration.JwtProvider;
import com.loparok.model.Customer;
import com.loparok.model.User;
import com.loparok.repository.CustomerRepository;
import com.loparok.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired CustomerRepository customerRepository;

    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public User findUserById(Long userId) throws Exception {
        Optional<User> opt = userRepository.findById(userId);

        if(opt.isPresent()){
            return opt.get();
        }
        throw new Exception("L'utilisateur n'est pas trouvé avec l'id :" + userId);
    }

    @Override
    public Customer findCustomerByJwt(String jwt) throws Exception {

        String email = jwtProvider.getEmailFromJwtToken(jwt);

        if(email==null){
            throw new Exception("provide valid jwt token");
        }

        Customer user= customerRepository.findByEmail(email);

        if (user==null){
            throw new Exception("utilisateur non trouvé avec cet email" + email);
        }

        return user;
    }

    @Override
    public User findUserByJwt(String jwt) throws Exception {
        String email = jwtProvider.getEmailFromJwtToken(jwt);

        if(email==null){
            throw new Exception("provide valid jwt token");
        }

        User user= userRepository.findByEmail(email);

        if (user==null){
            throw new Exception("utilisateur non trouvé avec cet email" + email);
        }

        return user;
    }
}
