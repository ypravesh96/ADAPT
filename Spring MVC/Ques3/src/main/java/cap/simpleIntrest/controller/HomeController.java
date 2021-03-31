package cap.simpleIntrest.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@RequestMapping(value="/calc.html",method=RequestMethod.GET)
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("SimpleIntrest");
	}
	@RequestMapping(value="/SI.html", method=RequestMethod.POST)
	public ModelAndView simpleInt(@ModelAttribute("user") User user)
	{
		if(user.getUsername()=="user" && user.getPassword()=="password")
		{
			return new ModelAndView("success");
		}
		else
		{
			return new ModelAndView("error");
		}
	} 
}