package com.pennant.propertystudio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.pennant.propertystudio.models.Customer;
import com.pennant.propertystudio.repositories.CustomerRepository;



@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @Cacheable("customer")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Cacheable("customer")
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }
    
    @CachePut("customer")
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @CacheEvict("cutomer")
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}