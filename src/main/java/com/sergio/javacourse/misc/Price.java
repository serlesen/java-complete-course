package com.sergio.javacourse.misc;

public class Price {

	public Float unitPrice;
	public Float vatPercentage;
	public Integer quantity;
	public String currency;
	
	public Price(Float unitPrice, Float vatPercentage, Integer quantity, String currency) {
		super();
		this.unitPrice = unitPrice;
		this.vatPercentage = vatPercentage;
		this.quantity = quantity;
		this.currency = currency;
	}

	
}
