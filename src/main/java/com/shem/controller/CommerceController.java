package com.shem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shem.model.Manager;
import com.shem.repo.EcommerceRepository;

@RestController
public class CommerceController {

	@Autowired
	private EcommerceRepository repo;
	
	@GetMapping("/managerList")
	public List<Manager> listOfManagers() {
		return repo.findAll();
	}
	public Manager retrieveManager(@PathVariable int id) throws Exception {
		Optional<Manager> man = repo.findById(id);
		if(!man.isPresent()) {
			throw new Exception("Manager id " + id + " not found");
		}
		return man.get();
	}
}
