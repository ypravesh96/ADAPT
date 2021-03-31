package homeCntrl;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class homeController {
	
	@Autowired
	private Strorage data;

	@RequestMapping(value="/reg.html",method=RequestMethod.GET)
	public ModelAndView hello()
	{
		ModelAndView model=new ModelAndView("registration");
		
		return model;
	}
	
	@RequestMapping(value="/submit.html", method=RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("user") User user) throws Exception
	{
		data.insertData(user);
		
		ModelAndView model=new ModelAndView("login");
		
		
		return model;
	}
	
	@RequestMapping(value ="/Check.html",method = RequestMethod.POST)
	public ModelAndView Check(@ModelAttribute ("user") User user) throws Exception {
		 
		boolean result = data.getData(user);
		
		
		if(result) {
			ModelAndView modelAndView = new ModelAndView("success");
			modelAndView.addObject("top", "Success");
			return modelAndView;
		}
		
		// returning the ERROR view
		else {
			ModelAndView modelAndView = new ModelAndView("error");
			modelAndView.addObject("errorMsg", "Error");
			return modelAndView;
		}
	}
	
}
