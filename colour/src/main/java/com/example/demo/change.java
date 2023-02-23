package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class change {
	String color="blue";
	@GetMapping("/")
	public String getcolor() {
		return "My Favourite color "+color+" !";
	}

}
