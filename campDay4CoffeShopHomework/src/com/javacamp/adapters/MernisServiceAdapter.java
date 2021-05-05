package com.javacamp.adapters;

import com.javacamp.abstracts.CustomerCheckService;
import com.javacamp.entities.Customer;
import mernis.QFIKPSPublicSoap;

import java.rmi.RemoteException;

public class MernisServiceAdapter implements CustomerCheckService {


    @Override
    public boolean checkIfReal(Customer customer) throws Exception {
        QFIKPSPublicSoap soapClient = new QFIKPSPublicSoap();
        boolean result = false;
    try {
        result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getTckn()), customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(), customer.getBirthDate().getYear());
    }catch (NumberFormatException e){
        e.printStackTrace();
    }catch (RemoteException e){
        e.printStackTrace();
    }return result;


    }
    }

