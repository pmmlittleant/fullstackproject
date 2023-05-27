package com.pmmcode.controller;

import com.pmmcode.customer.Customer;
import com.pmmcode.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("api/v1/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("api/v1/customers/{id}")
    public Customer getCustomer(@PathVariable("id") Integer customerId) {
        return customerService.getCustomer(customerId);

    }

}
