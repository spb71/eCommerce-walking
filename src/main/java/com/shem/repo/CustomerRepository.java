package com.shem.repo;

import org.springframework.data.repository.CrudRepository;

import com.shem.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
}
