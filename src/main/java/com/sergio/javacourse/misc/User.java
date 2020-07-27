package com.sergio.javacourse.misc;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	public String name;
	public int birthYear;
	public int age;
	
	public User(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public static List<User> buildUserList() {
		var users = new ArrayList<User>();
		
		users.add(new User("Mike", 1982));
		users.add(new User("Monica", 1998));
		users.add(new User("Bob", 1980));
		users.add(new User("Joe", 1990));
		users.add(new User("Rachel", 1989));
		users.add(new User("Albert", 1979));
		users.add(new User("John", 1983));
		users.add(new User("Maria", 1987));
		
		return users;
	}

}
