package com.kitchenStory.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class HomeController {

	@GetMapping("/")
	public String indexMapper() {
		return "Spring application server is up and running";
	}

}
