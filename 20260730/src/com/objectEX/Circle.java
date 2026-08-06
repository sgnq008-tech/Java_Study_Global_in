package com.objectEX;

public class Circle {
	
	//반지름과 이름
	
	int radius; // 원의 반지름(필드)
	String name; // 원의 이름(필드)
	
	// 원의 넓이 계산
	            //반환
	public double getArea() {
		
		// 원의 넓이 : 반지름 * 반지름 * 3.14
		return radius * radius * 3.14;
	}
	
	

}
