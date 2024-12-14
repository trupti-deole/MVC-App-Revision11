package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetController {
	@RequestMapping(value = "/greet")
	public String greetPage() {
		return "greet";
	}

	@RequestMapping(value = "/")
	public String landingPage() {
		return "index";
	}
}
