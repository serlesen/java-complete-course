package com.sergio.javacourse.forloop;

import java.util.List;

import com.sergio.javacourse.misc.User;

public class ForLoop {

	public static void main(String[] args) {
		
	}
	
	/**
	 * Iterate over the complete list using a for loop.
	 * At each iteration, print the users name.
	 */
	public static void one() {
		var users = User.buildUserList();
	}
	
	/**
	 * Iterate over the complete list using a for loop.
	 * For each user, calculate its age.
	 */
	public static List<User> two() {
		var users = User.buildUserList();
		
		return users;
	}
	
	/**
	 * Iterate over the complete list using a for loop.
	 * Search for the user named Bob.
	 * Return directly this user using the return word.
	 */
	public static User three() {
		var users = User.buildUserList();
		return null;
	}
}
