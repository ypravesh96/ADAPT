package com.Assignment.Employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private String employeeId;
	private String employeeName;
	private String employeeDeparnment;
	private String employeeDesignation;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDeparnment() {
		return employeeDeparnment;
	}
	public void setEmployeeDeparnment(String employeeDeparnment) {
		this.employeeDeparnment = employeeDeparnment;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public Employee(String employeeId, String employeeName, String employeeDeparnment, String employeeDesignation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDeparnment = employeeDeparnment;
		this.employeeDesignation = employeeDesignation;
	}
	

}
