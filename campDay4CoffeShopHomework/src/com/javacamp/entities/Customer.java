package com.javacamp.entities;

import java.util.Date;

public class Customer {
    int id;
    String firstName;
    String lastName;
    String tckn;
    Date birthDate;


    public Customer(int id, String firstName, String lastName, String tckn,Date birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tckn = tckn;
        this.birthDate = birthDate;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
