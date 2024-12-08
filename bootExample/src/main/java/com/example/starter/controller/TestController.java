package com.example.starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	//@GetMapping("/getMessage")
	
	@RequestMapping(value = "getM", method = RequestMethod.POST)
	public String getMessage()
	{
		return "Hello There";
		
	}

}