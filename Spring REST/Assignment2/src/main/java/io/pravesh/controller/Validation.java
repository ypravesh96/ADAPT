package io.pravesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class Validation {
	
	
		
		
	@RequestMapping(value = "/validate/{username}/{password}",method = RequestMethod.GET)
    public String validateUser(@PathVariable String  username,@PathVariable String password){
        if(username.equals("user") && password.equals("pass"))
             return "Valid User";
        else
            return "Invalid User";

    }
	}


