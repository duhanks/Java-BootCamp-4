package com.javacamp.abstracts;

import com.javacamp.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    @Override
    public  void save(Customer customer) throws Exception {
        System.out.println(customer.getFirstName() + " saved to DB");
    }

}
