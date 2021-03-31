package io.pravesh.controller;

public class Details {
	
	private String state;
	private String city;
	private String country;
	private String pin;
	
	
	public Details(String state, String city, String country, String pin) {
		super();
		this.state = state;
		this.city = city;
		this.country = country;
		this.pin = pin;
	}
	
	public Details() {
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	

}
