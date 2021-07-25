package com.in28minutes.learnspringframework.sample.enterprise.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringframework.sample.enterprise.flow.business.BusinessService;

// This is all part of the web layer
// Typically the three classes (web, business, data) would all be in their own packages.

// Web API; Sending response in the right format (ex. JSON, XML...)
@RestController			// so Restcontroller is actually a special version of Component
public class Controller {
	
	@Autowired
	private BusinessService businessService;
	
	//"/sum" => so user tries to invoke a sum function when clicking/ typing a certain URL: http://localhost:8080/sum
	@GetMapping("/sum")	
	public long displaySum() {
		return businessService.calculateSum();
	}
}


