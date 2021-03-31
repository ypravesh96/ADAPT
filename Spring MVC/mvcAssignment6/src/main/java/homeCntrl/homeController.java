package homeCntrl;




import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class homeController {

	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView hello()
	{
		ModelAndView model=new ModelAndView("home");
		
		return model;
	}
	
	@RequestMapping(value="/sumitAdmission.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm( @Valid @ModelAttribute("user") User user,BindingResult result)
	{
		if(result.hasErrors())
		{
			ModelAndView model=new ModelAndView("home");
			
			return model;
					
		}
		ModelAndView model=new ModelAndView("success");
		
		
		return model;
	}
	
}
