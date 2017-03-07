package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/")
	public String Test (){
		System.out.println("hello");
		return "index";
	}
	@RequestMapping("/scs")
	public @ResponseBody String Test2 (){
		System.out.println("hello");
		return "Hello";
	}
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String Test1 (){
		System.out.println("Test12");
		return "test";
	}
}
