package com.shem.dao;

import java.util.ArrayList;
import java.util.List;

import com.shem.model.Manager;

public class ManagerDAO {

	private List<Manager> list = new ArrayList<>();
	
	public void addNewEmp(Manager man) {
		list.add(man);
	}
	
	public List<Manager> getAllMans() {
		return new ArrayList<Manager>(list);
	}
}
