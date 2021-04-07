package com.ig.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddOrderController {

	@RequestMapping("/order")
	public String getOrder() {
		return "order.jsp";
		
	}
}
