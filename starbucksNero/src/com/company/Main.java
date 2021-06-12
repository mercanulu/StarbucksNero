package com.company;

import Abstract.BaseCustomerManager;
import Adapters.MerniceServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //BaseCustomerManager customerManager=new NeroCustomerManager();
        BaseCustomerManager customerManager=new StarbucksCustomerManager(new MerniceServiceAdapter());

        customerManager.save(new Customer(1,"Mercan","Ulu", LocalDate.of(1999,1,1),"012352"));

    }
}
