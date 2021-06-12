package Abstract;

import Entities.Customer;

public interface ICustomerCheckService {
    Boolean CheckIfRealPerson(Customer customer);
}
