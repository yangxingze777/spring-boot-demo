package com.yxz.springboot.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="account")
public class Account {
	@Id
	private Integer id;	
	private byte age;
	private String name;
	private String gender;
	private String password;
	private String permission;
	
	public Integer getID() {
		return id;		
	}
	
	public void setID(Integer id) {
		this.id = id;		
	}
	
	public byte getAge() {
		return age;
	}
	
	public void setAge(byte age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;		
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPermission() {
		return permission;
	}
	
	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	@Override
	public String toString() {
		return this.getName();
		
	}

}
