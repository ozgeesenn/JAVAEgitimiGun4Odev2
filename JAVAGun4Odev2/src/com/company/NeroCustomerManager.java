package com.company;

public class NeroCustomerManager extends BaseCustomerManager {

    private ICustomerCheckService _customerCheckService;

    public NeroCustomerManager(ICustomerCheckService customerCheckService) {
        _customerCheckService = customerCheckService;
    }

    public void save(Customer customer) {


        if (_customerCheckService.checkIfRealPerson(customer)) {
            save(customer);
        } else {
            System.out.println("Not a valid person");
        }

    }
}
