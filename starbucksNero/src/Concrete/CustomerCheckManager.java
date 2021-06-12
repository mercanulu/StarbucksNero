package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public Boolean CheckIfRealPerson(Customer customer) {

        return true;
    }
}
