package com.ig.service;

import java.util.ArrayList;
import java.util.List;

import com.ig.beans.Coffee;


public class CoffeeData {
	
	private List<Coffee> coffeeList = new ArrayList<Coffee>();
	public boolean addCoffee(Coffee coffee) {
		try {
			Boolean coffeeExists = coffeeList.contains(coffee);
			if (coffeeExists) {
				return false;
			}
			coffeeList.add(coffee);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public void listCoffee() {
		try {
			System.out.print(coffeeList);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
