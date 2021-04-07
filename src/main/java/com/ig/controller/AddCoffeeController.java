package com.ig.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ig.beans.Coffee;

import com.ig.service.CoffeeData;

@RestController
public class AddCoffeeController 
{
	private  CoffeeData coffeeData =  new CoffeeData();
	
	 @GetMapping("/coffee")
	  public String CoffeeForm(Model model) {
	    model.addAttribute("coffee", new Coffee());
	    return "coffee.jsp";
	  }

	@PostMapping("/coffee")
	  public String coffeeSubmit(@ModelAttribute Coffee coffee, Model model) throws NullPointerException {
	    System.out.println("hi m phunch ra");
	    model.addAttribute("coffee", coffee);
	    Boolean isCofeeDataAdded =  coffeeData.addCoffee(coffee);
	    coffeeData.listCoffee();
	    return isCofeeDataAdded ? "Coffee added" : "Duplicate coffee";
	  
	  }
}
