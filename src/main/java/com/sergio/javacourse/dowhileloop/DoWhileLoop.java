package com.sergio.javacourse.dowhileloop;

import java.util.Calendar;
import java.util.List;

import com.sergio.javacourse.misc.User;

public class DoWhileLoop {

	public static void main(String[] args) {
		
	}
	
	/**
	 * Iterate over the complete list using a do-while loop.
	 * At each iteration, print the users name.
	 */
	public static void one() {
		var users = User.buildUserList();
		
		int i = 0;
		do {
			System.out.println(users.get(i).name);
			i++;
		} while (i < users.size());
	}
	
	/**
	 * Iterate over the complete list using a do-while loop.
	 * For each user, calculate its age.
	 */
	public static List<User> two() {
		var users = User.buildUserList();
		
		var year = Calendar.getInstance().get(Calendar.YEAR);
		
		int i = 0;
		do {
			users.get(i).age = year - users.get(i).birthYear;
			i++;
		} while (i < users.size());
		
		return users;
	}
	
	/**
	 * Iterate over the complete list using a do-while loop.
	 * Search for the user named Bob.
	 * Return directly this user using the return word.
	 */
	public static User three() {
		var users = User.buildUserList();
		
		User result = null;
		
		int i = 0;
		do {
			if ("Bob".equals(users.get(i).name)) {
				result = users.get(i);
				break;
			}
			i++;
		} while (i < users.size());
		
		return result;
	}
}
