package com.etienne.springdemo.domain.product;

public abstract class GenericProduct {
	
	public int priceRandomizer = 1000;
	public abstract int calculatePrice();
}
