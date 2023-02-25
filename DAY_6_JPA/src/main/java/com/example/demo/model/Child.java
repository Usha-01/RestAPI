package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Child {
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String fathersName;
	private String mothersName;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public String getMothersName() {
		return mothersName;
	}
	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Child [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", fathersName="
				+ fathersName + ", mothersName=" + mothersName + ", address=" + address + "]";
	}
	

}
