package com.loparok.service;

import com.loparok.model.Customer;

public interface UserService {

    public Customer findCustomerByJwt(String jwt) throws Exception;

}
