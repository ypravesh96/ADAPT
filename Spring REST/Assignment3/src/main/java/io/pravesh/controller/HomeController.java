package io.pravesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class HomeController {
	
	
		
		
	@Autowired
	private AssignDetails details;
	
	
	@RequestMapping("/details/{id}")
	public Details displayDetails(@PathVariable String id)
	{
		return details.getDetails(id);
		
		
	}
	}


