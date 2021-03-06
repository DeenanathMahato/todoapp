package com.todoapp.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private Date dob;
	
	@ElementCollection // this annotation is most required
	private List<String> courses;
	private String gender;
	private String type;

	@OneToOne (targetEntity = Address.class, cascade = CascadeType.ALL)
	private Address address;
		
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Date dob, List<String> courses, String gender, String type, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.courses = courses;
		this.gender = gender;
		this.type = type;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + ", courses=" + courses + ", gender=" + gender
				+ ", type=" + type + ", address=" + address + "]";
	}

}
