package com.loparok.service;

import com.loparok.configuration.JwtProvider;
import com.loparok.model.Customer;
import com.loparok.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService{

    @Autowired CustomerRepository customerRepository;

    @Autowired
    private JwtProvider jwtProvider;


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
}
