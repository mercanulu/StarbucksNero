package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisService.UUPKPSPublicSoap;

public class MerniceServiceAdapter implements ICustomerCheckService {

    @Override
    public Boolean CheckIfRealPerson(Customer customer) {
        UUPKPSPublicSoap uupkpsPublicSoap=new UUPKPSPublicSoap();
        try{
            return uupkpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth().getDayOfMonth());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
