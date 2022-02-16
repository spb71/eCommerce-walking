package com.shem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shem.model.Manager;

public interface EcommerceRepository extends JpaRepository<Manager, Integer> {

}
