package io.pravesh.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
	public class AssignDetails {
		public List<Details> assign = new ArrayList<>( Arrays.asList(
				new Details("Lucknow","UP","India","226016"),
				new Details("Gorakhpur","UP","India","272164")
				
				));
		public Details getDetails(String id)
		{
		return	assign.stream().filter(t -> t.getPin().equals(id)).findFirst().get();	
		}

	}


