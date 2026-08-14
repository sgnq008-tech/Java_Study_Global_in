package com.inherex;

// 제품을 의미하는 객체
public class Product {
	
	// 제품 가격
	int price;
	
	// 제품 구매 시 제공하는 포인터 점수
	int bonusPoint;
	
	public Product(int price) {
		
		this.price = price;
		
		// 포인터 점수는 제품 가격의 10%
		bonusPoint = (int)(price / 10.0);
		
	}

}
