package com.javacamp.abstracts;

import com.javacamp.entities.Customer ;

public interface CustomerCheckService {
    boolean checkIfReal(Customer customer) throws Exception;
}
