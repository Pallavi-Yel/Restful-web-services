package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
	
	private Integer id;
	
	@Size(min=2, message = "Name should have atleast 2 characters")
	private String name;
	
	@Past(message = "Birth Date should be in past")
	private LocalDate bithDate;
	public User(Integer id, String name, LocalDate bithDate) {
		super();
		this.id = id;
		this.name = name;
		this.bithDate = bithDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBithDate() {
		return bithDate;
	}
	public void setBithDate(LocalDate bithDate) {
		this.bithDate = bithDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", bithDate=" + bithDate + "]";
	}

}
