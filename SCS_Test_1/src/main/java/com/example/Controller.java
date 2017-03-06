package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/")
	public String Test (){
		System.out.println("hello");
		return "index.html";
	}
	@RequestMapping("/scs")
	public @ResponseBody String Test2 (){
		System.out.println("hello");
		return "Hello";
	}
	
}
