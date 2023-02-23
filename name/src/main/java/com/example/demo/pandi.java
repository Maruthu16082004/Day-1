package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class pandi {
	@GetMapping("/")
	public String Name() { 
		String Name="Maruthu";
		return Name;
	}

}
