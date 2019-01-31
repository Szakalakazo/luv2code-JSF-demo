package com.luv2code.jsf;

import javax.faces.bean.ManagedBean;
import java.util.*;

@ManagedBean
public class Student2 {
	private String lastName;
	private String firstName;
	private String country;
	
	// list of countries for drop-down list
	List<String> countryOptions;
	
	public Student2(){
		countryOptions = new ArrayList<String>();
		
		countryOptions.add("Brazil");
		countryOptions.add("UK");
		countryOptions.add("Germany");
		countryOptions.add("USA");
		countryOptions.add("Poland");
		countryOptions.add("xxxxxx");
		
		
	}
	
	public List<String> getCountryOptions() {
		return countryOptions;
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
