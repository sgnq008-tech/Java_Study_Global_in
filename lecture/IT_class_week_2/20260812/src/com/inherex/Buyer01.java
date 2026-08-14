package com.inherex;

// 제품을 사는 사람(고객)
public class Buyer01 {
	
	// 보유 금액
	int money = 1000;
			
	// 제품 구매 후 적립 포인트
	int bonusPoint = 0;
	
	// 매개변수의 다형성
	public void buy(Product p) {
				
		if(money < p.price) {
					
			System.out.println("금액이 부족하여 제품을 구매할 수 없습니다.");
					
			return;
					
		}
		
		// 가진 돈에서 구입한 제품의 가격을 뺌
		money -= p.price;
		
		// 제품 구매 후 적립 포인트가 추가
		bonusPoint += p.bonusPoint;
		
		System.out.println(p + "을(를) 구매하셨습니다.");
				
	}

}
