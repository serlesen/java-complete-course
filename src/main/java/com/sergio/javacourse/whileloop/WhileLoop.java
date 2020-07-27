package com.sergio.javacourse.whileloop;

import java.util.Calendar;
import java.util.List;

import com.sergio.javacourse.misc.User;

public class WhileLoop {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * Iterate over the complete list using a while loop.
	 * At each iteration, print the users name.
	 */
	public static void one() {
		var users = User.buildUserList();
		
		int i = 0;
		while (i < users.size()) {
			System.out.println(users.get(i).name);
			i++;
		}
	}
	
	/**
	 * Iterate over the complete list using a while loop.
	 * For each user, calculate its age.
	 */
	public static List<User> two() {
		var users = User.buildUserList();
		
		var year = Calendar.getInstance().get(Calendar.YEAR);
		
		int i = 0;
		while (i < users.size()) {
			users.get(i).age = year - users.get(i).birthYear;
			i++;
		}
		
		return users;
	}
	
	/**
	 * Iterate over the complete list using a while loop.
	 * Search for the user named Bob.
	 * Return directly this user using the return word.
	 */
	public static User three() {
		var users = User.buildUserList();
		
		User result = null;
		
		int i = 0;
		while (i < users.size()) {
			if ("Bob".equals(users.get(i).name)) {
				result = users.get(i);
				break;
			}
			i++;
		}
		
		return result;
	}

}
