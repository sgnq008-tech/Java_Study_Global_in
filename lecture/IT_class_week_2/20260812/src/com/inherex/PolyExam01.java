package com.inherex;

public class PolyExam01 {

	public static void main(String[] args) {
		
		Buyer01 b = new Buyer01();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 금액 : " + b.money + "만원");
		System.out.println("현재 적립 포인트 : " + b.bonusPoint + "p");

	}

}
