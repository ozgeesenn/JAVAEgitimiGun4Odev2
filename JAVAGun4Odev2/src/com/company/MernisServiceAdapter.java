package com.company;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return false;
        //TCKN dogrulama
    }
}
