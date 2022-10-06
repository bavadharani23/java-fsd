package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("manager")
public class ManagerController {
	@GetMapping(value="say")
	public String sayHelloByManager()
	{
		return "welcome to spring manager micro service";
	}
	
	

}
