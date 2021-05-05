package com.javacamp.concrete;
import com.javacamp.abstracts.BaseCustomerManager;
import com.javacamp.abstracts.CustomerCheckService;
import com.javacamp.entities.Customer;



public class StarbucksCustomerManager extends BaseCustomerManager {

    CustomerCheckService customerCheckService;
    public StarbucksCustomerManager(CustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }



    @Override
    public void save(Customer customer) throws Exception{

        if (customerCheckService.checkIfReal(customer)) {
            System.out.println("Verification confirmed");
            super.save(customer);
        }else
            System.out.println("You must be a robot!!!");

    }
}
