package com.javacamp.concrete;

import com.javacamp.abstracts.CustomerCheckService;
import com.javacamp.entities.Customer;


public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfReal(Customer customer) {
        return true;
    }
}

