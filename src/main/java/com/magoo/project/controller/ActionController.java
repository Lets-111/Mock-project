package com.magoo.project.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {
	
	@RequestMapping("/api/v1/getHello")
	public List<String> getBooks()
	{
		List<String> list=Arrays.asList("Harry","Lets think","Barbie ride");
		return list;
	}
	
	@RequestMapping(method=RequestMethod.POST ,path="/api/v1/postBook")
	public String hello()
	{
		System.out.println("This is for just adding new book");
		return "XYZ";
	}

	@RequestMapping("/api/v1/getAuthor")
	public String getAuthorName()
	{
		System.out.println("Author name is Dipanshu Magoo");
		return "Dipanshu";
	}
}
