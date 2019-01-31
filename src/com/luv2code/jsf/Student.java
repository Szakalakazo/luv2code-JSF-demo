package com.luv2code.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	
	private String firstName;
	private String lastName;
	
	public Student(){
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firsName) {
		this.firstName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
}