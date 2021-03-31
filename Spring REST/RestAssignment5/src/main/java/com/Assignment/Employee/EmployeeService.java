package com.Assignment.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		
		List<Employee> employee=new ArrayList<Employee>();
		
		employeeRepository.findAll().forEach(employee::add);
		return employee;
	}

	public void addEmployee(Employee employee) {
		
		employeeRepository.save(employee);
		
		
	}

	public Employee getEmployee(String id) {
		
		return employeeRepository.findById(null).get();
	}

	public void deleteEmployee(String id) {
		
		employeeRepository.deleteById(id);
	}

	public void updateEmployee(String id, Employee employee) {
		
		
		employeeRepository.save(employee);
		
	}

}
