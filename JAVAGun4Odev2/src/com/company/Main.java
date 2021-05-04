package com.company;

public class Main {

    public static void main(String[] args) {

        BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer customer=new Customer();
        customer.id=1;
        customer.firstName="Engin";
        customer.lastName="Demirog";
        customer.dateOfBirth="1985-01-06";
        customer.nationalityID="23124214";
        customerManager.save(customer);


    }
}
