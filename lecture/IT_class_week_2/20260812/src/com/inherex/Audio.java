package com.inherex;

public class Audio extends Product {
	
	// 부모 클래스의 생성자 Product(int price)를 호출
	public Audio() {
		
		// Audio의 가격을 50만원으로 초기화
		super(50);
		
	}
	
	// Object 클래스의 toString() 메서드를 오버라이딩
	@Override
	public String toString() {
		
		return "Audio";
		
	}

}
