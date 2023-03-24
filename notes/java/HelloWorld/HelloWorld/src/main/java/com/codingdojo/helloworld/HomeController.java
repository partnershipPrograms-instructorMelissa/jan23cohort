package com.codingdojo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}
	
	@RequestMapping("/new")
	public String MyIndex() {
		return "You Got This! Yes I do!";
	}
}
