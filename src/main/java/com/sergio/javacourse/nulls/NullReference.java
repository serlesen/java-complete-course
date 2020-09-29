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
			if (book.title.equals(bookName)) {
				return book;
			}
		}
		
		// and replace also this line
		return null;
	}
	
	
	/**
	 * Calculate the total price of the input parameter as: unitPrice * vatPercentage * quantity.
	 * But if there is no price, return "null".
	 */
	public static Float two(Price price) {
		
		if (price.unitPrice == null
				|| price.vatPercentage == null
				|| price.quantity == null) {
			return null;
		}
		
		return price.unitPrice * price.vatPercentage * price.quantity;
	}
	
	
	/**
	 * Build a Price object if all the input values are different from null.
	 */
	public static Price three(Float unitPrice, Float vatPercentage, Integer quantity, String currency) {
		if (unitPrice == null
				|| vatPercentage == null
				|| quantity == null
				|| currency == null) {
			return null;
		}
		
		return new Price(unitPrice, vatPercentage, quantity, currency);
	}

}
