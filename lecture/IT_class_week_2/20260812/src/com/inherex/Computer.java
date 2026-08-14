package com.inherex;

public class Computer extends Product {
	
	// 부모 클래스의 생성자 Product(int price)를 호출
	public Computer() {
		
		// Computer의 가격을 200만원으로 초기화
		super(200);
		
	}
	
	// Object 클래스의 toString() 메서드를 오버라이딩
	@Override
	public String toString() {
		
		return "Computer";
		
	}

}
