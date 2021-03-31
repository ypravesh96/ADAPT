package com.Assignment.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	
	
	@RequestMapping(value="/employee", method=RequestMethod.POST)
	public void addTopic(@RequestBody Employee employee) {
		
		employeeService.addEmployee(employee);
		
	}
	
	
	@RequestMapping(value="/employee/{id}")
	public Employee getEmployee(@PathVariable String id)
	{
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(value="/employee/{id}", method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable String id) {
		
		employeeService.deleteEmployee(id);
		
		}
	@RequestMapping(value="/employee/{id}", method=RequestMethod.PUT)
	public void updateTopic(@RequestBody Employee employee,@PathVariable String id) {
		
		employeeService.updateEmployee(id,employee);
		
	}

}
