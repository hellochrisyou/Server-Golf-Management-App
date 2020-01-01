package com.server.golf.command;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class AccountForm {

	@Id
    private String id;
	private String name;
	private String email;
	private int age;
	private String gender;
	private String city;
	private String state;
	private String password;
	private float handicap;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getHandicap() {
		return handicap;
	}
	public void setHandicap(float handicap) {
		this.handicap = handicap;
	}
	
	
}

