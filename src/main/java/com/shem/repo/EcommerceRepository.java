package com.shem.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shem.model.Manager;

@Repository
public interface EcommerceRepository extends CrudRepository<Manager, Integer> {

}
