package com.ig.controller;




import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import com.ig.beans.Customer;
import com.ig.service.CustomerData;


@RestController
public class AddCustomerController {	

	private CustomerData customerData = new CustomerData();

	 @GetMapping("/customer")
	  public String CustomerForm(Model model) {
	    model.addAttribute("customer", new Customer());
	    return "customer.jsp";
	  }

	@PostMapping("/customer")
	  public String customerSubmit(@ModelAttribute Customer customer, Model model) throws NullPointerException {
	    model.addAttribute("customer", customer);
	    Boolean isCustomerAdded =  customerData.addCustomer(customer);
	    customerData.listCustomers();
	    return isCustomerAdded ? "Customer sucessfully created" : "Customer already exists";
	  
	  }
	
	
}
