package com.sergio.javacourse.foreachloop;

import java.util.Calendar;
import java.util.List;

import com.sergio.javacourse.misc.User;

public class ForEachLoop {

	public static void main(String[] args) {
		
	}
	
	/**
	 * Iterate over the complete list using a for-each loop.
	 * At each iteration, print the users name.
	 */
	public static void one() {
		var users = User.buildUserList();
		
		for (var user : users) {
			System.out.println(user.name);
		}
	}
	
	/**
	 * Iterate over the complete list using a for-each loop.
	 * For each user, calculate its age.
	 */
	public static List<User> two() {
		var users = User.buildUserList();
		
		var year = Calendar.getInstance().get(Calendar.YEAR);
		
		for (var user : users) {
			user.age = year - user.birthYear;
		}
		
		return users;
	}
	
	/**
	 * Iterate over the complete list using a for-each loop.
	 * Search for the user named Bob.
	 * Return directly this user using the return word.
	 */
	public static User three() {
		var users = User.buildUserList();
		
		User result = null;
		
		for (var user : users) {
			if ("Bob".equals(user.name)) {
				result = user;
				break;
			}
		}
		return result;
	}
}
