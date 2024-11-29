package com.example.simpleecommerceapp.cntroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.simpleecommerceapp.entity.Order;
import com.example.simpleecommerceapp.service.OrderService;

import ch.qos.logback.core.model.Model;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	
	
}
