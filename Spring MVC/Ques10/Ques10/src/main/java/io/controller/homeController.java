package io.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
	@RequestMapping("/excel.html")  
    public ModelAndView displayExcel()  
    {  
		List<Employee> emp = Arrays.asList(
                new Employee(1,"Bob",75000),
                new Employee(2,"Rahul",90000),
                new Employee(3,"Rakesh",50000),
                new Employee(3,"Udit",80000),
		           new Employee(3,"Jai",66000));

        ModelAndView model = new ModelAndView(new ExcelReportView());
        model.addObject("empList",emp);
        return  model; 
    }  
    

}
