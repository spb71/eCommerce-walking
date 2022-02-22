package com.shem.repo;

import org.springframework.data.repository.CrudRepository;

import com.shem.model.Manager;

public interface EcommerceRepository extends CrudRepository<Manager, Integer> {

}
