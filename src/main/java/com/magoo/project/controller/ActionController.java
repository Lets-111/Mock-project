package com.magoo.project.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {
	
	@RequestMapping("/api/v1/getHello")
	public List<String> getBooks()
	{
		List<String> list=Arrays.asList("Harry","Lets think","Barbie ride");
		return list;
	}

}
