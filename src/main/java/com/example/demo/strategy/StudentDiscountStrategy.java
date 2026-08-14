package com.example.demo.strategy;

public class StudentDiscountStrategy implements DiscountStrategy{

	@Override
	public double applyDiscount(double price) {
		return price * 0.90; //ลด10%
	}

}
