package com.inherex2;
/*
 * 참조형 변수(객체, 인스턴스) 형변환
 * 자손 클래스 -> 조상 클래스 : Up-casting
 * 		자손클래스의 참조변수를 저싱 클래스의 참조변수로 환하는일
 * 		 
 * 조상 클래스 -> 자손 클래스 : Down-casting
 * 		조상클래스의 참조변수를 자손 클래스의 참조변수로 환하는일
 * 
 * 참조 변수간의 형변환 역시 캐스트 연산자를 사용하여,
 * 괄호() 안에 변환 하고자 하는 타입의 class명을 
 *  
 *  
 */

public class Car {
	String color;
	int door;
	
	void drive()
	{
		System.out.println("drive, Brrrr!!!");
	}
	
	void stop()
	{
		System.out.println("stop !!!");
	}
}
