package com.ig.beans;

import org.springframework.stereotype.Component;


@Component
public class Customer {
	
	
	private int Id;
	private String customerName;
	private String phoneNumber;
	
	
	public Customer() {
		
	}
	


	public Customer(int id, String customerName, String phoneNumber) {
		super();
		Id = id;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
	}

	


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber + "]";
	}
	
	

}
