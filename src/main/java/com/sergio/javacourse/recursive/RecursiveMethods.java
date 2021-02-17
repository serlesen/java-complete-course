package com.sergio.javacourse.recursive;

public class RecursiveMethods {

	public static void main() {
		
	}
	
	/**
	 * Write this method to be recursive.
	 * It must return the amount of people in a family starting from one person.
	 * 
	 * This person counts as 1.
	 * If it's maried, add one to the result.
	 * Add as many children as the person has.
	 * Do the same for the children (and grand-children, etc).
	 */
	public static int amountInFamily(Person person) {
		if (person.children == null) {
			return person.maried ? 2 : 1;
		}
		int currentFamilty = 0;
		for (Person child : person.children) {
			currentFamilty += amountInFamily(child);
		}
		currentFamilty += person.maried ? 2 : 1;
		return currentFamilty;
	}
	
}
