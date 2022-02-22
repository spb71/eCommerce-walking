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

import com.shem.model.Manager;
import com.shem.repo.EcommerceRepository;

@RestController
@RequestMapping("/api")
public class CommerceController {

	@Autowired
	private EcommerceRepository repo;
	
	@GetMapping("/managers")
	public List<Manager> listOfManagers() {
		final List<Manager> managerList = new ArrayList<Manager>();
		  Iterable<Manager> iterable = repo.findAll();
		  iterable.forEach(managerList::add);
		  return managerList;
	}
	
	@GetMapping("/managers/{id}")
	 public ResponseEntity<Manager> getProductById(@PathVariable(value = "id") int id) {
	 Optional<Manager> product = repo.findById(id);
	 return product.isPresent() ? new ResponseEntity<Manager>(product.get(), HttpStatus.OK)
			 : new ResponseEntity("No data found", HttpStatus.NOT_FOUND);
	 }
	
	@PostMapping("/managers")
	 public Manager createManager(@RequestBody Manager manager) {
	  return repo.save(manager);
	 }
	
	@DeleteMapping("/managers/{id}")
	 public ResponseEntity<Manager> deleteProduct(@PathVariable(value = "id") int id) {
	  Optional<Manager> product = repo.findById(id);
	  if (product.isPresent()) {
	   repo.delete(product.get());
	   return new ResponseEntity("Product has been deleted successfully.", HttpStatus.OK);
	  } else {
	   return ResponseEntity.notFound().build();
	  }
	}
}
