package com.inherex;

/*
 * 참조형 변수(객체 = 인스턴스) 형변환]
 * 	- 자손 클래스 -> 조상 클래스 = Up-casting
 * 	- 조상 클래스 -> 자손 클래스 = Down-casting
 * 	- 참조 변수 간의 형변환 역시 캐스트 연산자를 사용하여,
 * 	  괄호() 안에 변환하고자 하는 타입의 클래스명을 적으면 됨
 * 
 * Up-casting]
 * 	- 자손 클래스의 참조 변수를 조상 타입의 참조 변수로 변환하는 것을 의미
 * 
 * Down-casting]
 * 	- 조상 클래스의 참조 변수를 자손 클래스의 참조 변수로 변환하는 것을 의미
 * 
 * 
 */

public class Car {
	
	String color;
	
	int door;
	
	// 운전 기능
	void drive() {
		
		System.out.println("drive, Brrrr !!!!");
		
	}
	
	// 정지 기능
	void stop() {
		
		System.out.println("stop !!!!");
		
	}

}
