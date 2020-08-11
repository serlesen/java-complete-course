package com.sergio.javacourse.lists;

import java.util.ArrayList;

public class Lists {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * Create a list with three Integers and return it. 
	 */
	public static ArrayList<Integer> one() {
		var list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		return list;
	}
	
	/**
	 * Add another Integer to the list below and remove the second element.
	 */
	public static ArrayList<Integer> two() {
		var list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(15);
		
		list.add(100);
		list.remove(1);
		
		return list;
	}
	
	/**
	 * Return the index of the element with the value 5 from the input list. 
	 * 
	 */
	public static int three(ArrayList<Integer> list) {
		return list.indexOf(5);
	}

}
