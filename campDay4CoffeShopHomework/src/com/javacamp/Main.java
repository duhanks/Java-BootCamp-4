package com.javacamp;

import com.javacamp.abstracts.BaseCustomerManager;
import com.javacamp.adapters.MernisServiceAdapter;
import com.javacamp.concrete.StarbucksCustomerManager;
import com.javacamp.entities.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {

        Customer customer = new Customer(1,"a","b","00000000000",new Date(1900,19,19));

        System.out.println(customer.getFirstName() + customer.getLastName());

        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        starbucksCustomerManager.save(customer);

    }
}
