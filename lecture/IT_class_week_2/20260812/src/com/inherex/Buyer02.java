package com.inherex;

// 제품을 사는 사람(고객)
public class Buyer02 {
	
	int money = 1000;
	
	int bonusPoint = 0;
	
	// 구매한 제품을 저장하기 위한 객체배열 선언
	Product[] item = new Product[10];
	
	// Product 배열을 카운터할 변수
	int i = 0;
	
	public void buy(Product p) {
		
		if(money < p.price) {
			
			System.out.println("금액이 부족하여 제품을 구매할 수 없습니다.");
			
			return;
			
		}
		
		money -= p.price;
		
		bonusPoint += p.bonusPoint;
		
		// 제품을 Product 배열에 저장
		item[i++] = p;
		
		System.out.println(p + "을(를) 구매하셨습니다.");
		
	}
	
	// 구매한 제품 정보를 출력
	public void summary() {
		
		// 구매한 제품들의 총합
		int sum = 0;
		
		// 구매한 제품 목록을 저장할 변수
		String itemList = "";
		
		// 반복문을 활용해서 구매한 제품의 총합과 목록을 만듬
		for(int i = 0; i < item.length; i++) {
			
			if(item[i] == null) {
				
				break;
				
			} else {
				
				sum += item[i].price;
				
				itemList += item[i] + " ";
				
			}
			
		}
		
		System.out.println("구매한 제품 총 금액 : " + sum + "만원");
		System.out.println("구매한 제품 목록 : " + itemList);
		System.out.println("현재 적립 포인트 : " + bonusPoint + "p");
		
	}

}
