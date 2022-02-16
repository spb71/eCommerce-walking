package com.shem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="datajpa")
public class Customer {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int custId;
	private int custName;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getCustName() {
		return custName;
	}
	public void setCustName(int custName) {
		this.custName = custName;
	}
	
}
