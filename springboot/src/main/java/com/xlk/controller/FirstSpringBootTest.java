package com.xlk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstSpringBootTest {

	@RequestMapping("/hi")
	public String getString() {
		return "xlk";
	}
	
	@RequestMapping("/hello")
	public String getString1() {
		return "xlk and cy";
	}
	
	@RequestMapping("/hello1")
	public String getString2() {
		return "xlk and cy and kd";
	}
}
