package com.example.demo.strategy;
	
public class NoDiscountStrategy implements DiscountStrategy{
	
	@Override
	public double applyDiscount(double price) {
		// TODO Auto-generated method stub
		return price ;//ไม่ลดราคา
	}
}