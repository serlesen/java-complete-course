package com.sergio.javacourse.nulls;

import com.sergio.javacourse.misc.Book;
import com.sergio.javacourse.misc.Price;

public class NullReference {
	
	public static void main(String[] args) {
		
	}
	
	
	/**
	 * Update this method to return the book which is equal to the input parameter "bookName".
	 * If the book is not found, return "null".
	 */
	public static Book one(String bookName) {
		var books = Book.buildBooks();
		
		for (Book book : books) {
			
			// insert the login here
			
		}
		
		// and replace also this line
		return new Book("", "");
		
	}
	
	
	/**
	 * Calculate the total price of the input parameter as: unitPrice * vatPercentage * quantity.
	 * But if there is no price, return "null".
	 */
	public static Float two(Price price) {
		
		return 0f;
	}
	
	
	/**
	 * Build a Price object if all the input values are different from null.
	 */
	public static Price three(Float unitPrice, Float vatPercentage, Integer quantity, String currencty) {
		return null;
	}

}
