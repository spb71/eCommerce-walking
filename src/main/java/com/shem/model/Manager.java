package com.shem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="datajpa")
public class Manager {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int manId;
	private int manName;
	private int manSal;
	public int getManId() {
		return manId;
	}
	public void setManId(int manId) {
		this.manId = manId;
	}
	public int getManName() {
		return manName;
	}
	public void setManName(int manName) {
		this.manName = manName;
	}
	public int getManSal() {
		return manSal;
	}
	public void setManSal(int manSal) {
		this.manSal = manSal;
	}
	
}
