package com.pmmcode.customer;

import com.pmmcode.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class CustomerDataAccessService implements CustomerDao{
    private static List<Customer> customers;
    static {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "Alex", "alex@gmail.com", 21));
        customers.add(new Customer(2, "Bob", "bob@gmail.com", 24));
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst();

    }
}
