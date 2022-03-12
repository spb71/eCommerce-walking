package com.shem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shem.model.Customer;
import com.shem.model.Manager;

@Repository
public interface ManagerRepository extends CrudRepository<Manager, Long> {

}

