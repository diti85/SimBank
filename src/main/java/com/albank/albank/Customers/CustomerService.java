package com.albank.albank.Customers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {
    private final CustomerRepo custRepo;
    @Autowired
    public CustomerService(CustomerRepo custRepo) {
        this.custRepo = custRepo;
    }

    public List<Customer> getCustomers(){
        return custRepo.findAll();
    }

}
