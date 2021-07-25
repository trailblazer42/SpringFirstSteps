package com.in28minutes.learnspringframework.sample.enterprise.flow.data;

import java.util.List;

import org.springframework.stereotype.Component;

// Getting data
@Component
public class DataService {
	public List<Integer> retrieveData() {
		return List.of(12,34,56,78,90);
	}
	
 } 