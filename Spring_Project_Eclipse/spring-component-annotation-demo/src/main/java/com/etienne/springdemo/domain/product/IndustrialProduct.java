package com.etienne.springdemo.domain.product;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class IndustrialProduct extends GenericProduct {

	@Override
	public int calculatePrice() {
		Random random = new Random();
		int price = random.nextInt(priceRandomizer);
		return price;
	}

}
