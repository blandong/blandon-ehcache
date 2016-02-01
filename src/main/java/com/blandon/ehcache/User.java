package com.blandon.ehcache;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 6123071113969415736L;
	
	private String name;
	
	private int age;

	public User(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
