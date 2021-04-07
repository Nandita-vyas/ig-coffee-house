package com.ig.service;

import java.util.ArrayList;
import java.util.List;

import com.ig.beans.Customer;

public class CustomerData {
	private List<Customer> customerList = new ArrayList<Customer>();
	public boolean addCustomer(Customer customer) {
		try {
			Boolean customerExists = customerList.contains(customer);
			if (customerExists) {
				return false;
			}
			customerList.add(customer);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public void listCustomers() {
		try {
			System.out.print(customerList);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
