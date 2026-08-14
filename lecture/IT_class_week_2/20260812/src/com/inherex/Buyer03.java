package com.inherex;

import java.util.Vector;

public class Buyer03 {
	
	int money = 1000;
	int bonusPoint = 0;
	
	// 구매한 제품을 저장할 Vector 객체를 선언
	Vector item = new Vector();
	
	public void buy(Product p) {
		
		if(money < p.price) {
			
			System.out.println("금액이 부족하여 제품을 구매할 수 없습니다.");
			
			return;
			
		}
		
		money -= p.price;
		
		bonusPoint += p.bonusPoint;
		
		// 구매한 제품을 Vector 에 저장 -> item
		item.add(p);
		
		System.out.println(p + "을(를) 구매하셨습니다.");
		
	}
	
	// 구매한 제품을 환불
	public void refund(Product p) {
		
		// 제품을 Vector 에서 제거 -> remove
		if(item.remove(p)) { // 반품 처리가 되었을 경우
			
			money += p.price;
			
			bonusPoint -= p.bonusPoint;
			
			System.out.println(p + "을(를) 반품하셨습니다.");
			
		} else { // 반품 처리가 안 되었을 경우
			
			System.out.println("구매한 제품 중 해당 제품이 없습니다.");
			
		}
		
	}
	
	// 구매한 제품에 대한 정보를 요약해서 출력
	public void summary() {
		
		int sum = 0;
		
		String itemList = "";
		
		// Vector 가 비어있는지 확인
		if(item.isEmpty()) {
			
			System.out.println("구매하신 제품이 없습니다.");
			
			return;
			
		}
		
		// 반복문을 활용해서 구매한 제품의 총합과 목록을 만듬
		for(int i = 0; i < item.size(); i++) {
			
			Product p = (Product)item.get(i);
			
			sum += p.price;
			
			itemList += (i == 0) ? ("" + p) : (", " + p);
			
		}
		
		System.out.println("구매한 제품 총 금액 : " + sum + "만원");
		System.out.println("구매한 제품 목록 : " + itemList);
		System.out.println("현재 적립 포인트 : " + bonusPoint + "p");
		
	}

}
