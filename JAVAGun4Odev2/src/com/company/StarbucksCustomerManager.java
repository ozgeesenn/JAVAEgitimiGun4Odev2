package com.company;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private ICustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        _customerCheckService = customerCheckService;
    }

    public void save(Customer customer) {


        if(_customerCheckService.checkIfRealPerson(customer))
        {
            save(customer);
        }
        else
        {
            System.out.println("Not a valid person");
        }

    }


}
