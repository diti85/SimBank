package com.albank.albank.Customers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/customer")
public class CustomersController {
    private final CustomerService custService;
    @Autowired
    public CustomersController(CustomerService custServcie) {
        this.custService = custServcie;
    }

    @GetMapping
    public List<Customer> getCustomers(){
        return custService.getCustomers();
    }

    
}
