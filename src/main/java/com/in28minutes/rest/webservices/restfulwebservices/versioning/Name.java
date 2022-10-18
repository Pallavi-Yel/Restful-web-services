package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class Name {
	private String FirstNmae;
	private String LastName;
	public Name(String firstNmae, String lastName) {
		super();
		FirstNmae = firstNmae;
		LastName = lastName;
	}
	public String getFirstNmae() {
		return FirstNmae;
	}
	public String getLastName() {
		return LastName;
	}
	@Override
	public String toString() {
		return "Name [FirstNmae=" + FirstNmae + ", LastName=" + LastName + "]";
	}
	
	
}
