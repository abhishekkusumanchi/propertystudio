package com.pennant.propertystudio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pennant.propertystudio.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
