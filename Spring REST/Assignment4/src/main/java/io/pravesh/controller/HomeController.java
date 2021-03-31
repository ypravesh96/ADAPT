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
	
	
		
		
	 @RequestMapping(value = "/validate/{cardNo}",method = RequestMethod.GET)

	    public String validateCreditCard(@PathVariable("cardNo") String cardNo){
	        CardValidator cardValidator = new CardValidator();
	        cardValidator.setCardNo(cardNo);
	        String res = cardValidator.isValidCard();
	        return  res;
	    }
	}


