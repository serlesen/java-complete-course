package com.sergio.javacourse.user;

public class User {
	
	public String name;
	public int age;
	public int money;
	
	public User(String name, int age, int money) {
		super();
		this.name = name;
		this.age = age;
		this.money = money;
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof User)) {
			return false;
		}
		
		User otherUser = (User) other;
		
		if (!name.equals(otherUser.name)) {
			return false;
		}
		
		if (age != otherUser.age) {
			return false;
		}
		
		if (money != otherUser.money) {
			return false;
		}
		
		return true;
	}

}
