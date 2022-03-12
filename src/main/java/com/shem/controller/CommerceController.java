package com.shem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shem.model.Customer;
import com.shem.model.Manager;
import com.shem.repo.CustomerRepository;
import com.shem.repo.ManagerRepository;

@RestController
@RequestMapping("/api")
public class CommerceController {

	@Autowired
	private ManagerRepository managerRepo;
	private CustomerRepository customerRepo;
	
	@GetMapping("/managers")
	public List<Manager> listOfManagers1() {
		final List<Manager> managerList = new ArrayList<Manager>();
		  Iterable<Manager> iterable = managerRepo.findAll();
		  iterable.forEach(managerList::add);
		  return managerList;
	}
	
	@GetMapping("/managers/{id}")
	 public ResponseEntity<Manager> getManagerById(@PathVariable(value = "id") long id) {
	 Optional<Manager> product = managerRepo.findById(id);
	 return product.isPresent() ? new ResponseEntity<Manager>(product.get(), HttpStatus.OK)
			 : new ResponseEntity("No data found", HttpStatus.NOT_FOUND);
	 }
	
	@PostMapping("/managers")
	 public Manager createManager1(@RequestBody Manager manager) {
	  return managerRepo.save(manager);
	 }
	
	@DeleteMapping("/managers/{id}")
	 public ResponseEntity<Manager> deleteManager(@PathVariable(value = "id") long id) {
	  Optional<Manager> manage = managerRepo.findById(id);
	  if (manage.isPresent()) {
	   managerRepo.delete(manage.get());
	   return new ResponseEntity("Manager record has been deleted successfully.", HttpStatus.OK);
	  } else {
	   return ResponseEntity.notFound().build();
	  }
	}
	@GetMapping("/customers")
	public List<Customer> listOfCustomers() {
		final List<Customer> customerList = new ArrayList<Customer>();
		  Iterable<Customer> iterable = customerRepo.findAll();
		  iterable.forEach(customerList::add);
		  return customerList;
	}
	
	@GetMapping("/customers/{id}")
	 public ResponseEntity<Customer> getCustomerById(@PathVariable(value = "id") long id) {
	 Optional<Customer> customer = customerRepo.findById(id);
	 return customer.isPresent() ? new ResponseEntity<Customer>(customer.get(), HttpStatus.OK)
			 : new ResponseEntity("No data found", HttpStatus.NOT_FOUND);
	 }
	
	@PostMapping("/customers")
	 public Customer createCustomer(@RequestBody Customer customer) {
	  return customerRepo.save(customer);
	 }
	
	@DeleteMapping("/customers/{id}")
	 public ResponseEntity<Customer> deleteCustomer(@PathVariable(value = "id") long id) {
	  Optional<Customer> product = customerRepo.findById(id);
	  if (product.isPresent()) {
	   customerRepo.delete(product.get());
	   return new ResponseEntity("Manager record has been deleted successfully.", HttpStatus.OK);
	  } else {
	   return ResponseEntity.notFound().build();
	  }
	}
}
