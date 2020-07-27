package com.sergio.javacourse.whileloop;

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
	}
	
	/**
	 * Iterate over the complete list using a while loop.
	 * For each user, calculate its age.
	 */
	public static List<User> two() {
		var users = User.buildUserList();
		
		return users;
	}
	
	/**
	 * Iterate over the complete list using a while loop.
	 * Search for the user named Bob.
	 * Return directly this user using the return word.
	 */
	public static User three() {
		var users = User.buildUserList();
		return null;
	}

}
