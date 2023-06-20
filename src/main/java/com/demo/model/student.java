package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long rollno;
	private String firstname;
	private String lastname;
	private String address;
	public long getRollno() {
		return rollno;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public student(long rollno, String firstname, String lastname, String address) {
		super();
		this.rollno = rollno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}
	public student() {
		super();
		
	}
	
	
	
	
}
