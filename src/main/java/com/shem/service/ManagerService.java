package com.shem.service;

import java.util.List;

import com.shem.dao.ManagerDAO;
import com.shem.model.Manager;

public class ManagerService {

	ManagerDAO dao;
	
	public void addNewManager(Manager emp) {
		dao.addNewEmp(emp);
	}
	
	public List<Manager> getAllsEmployee() {
		return dao.getAllMans();
	}

	public void setDao(ManagerDAO dao) {
		this.dao = dao;
	}
}
