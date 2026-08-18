package com.interex;
/*추상 클래스와 인터페이스
 * 
 * 1. 추상 클래스와 인터페이스의 차이점
 * 		abstract class class 명 {			interface interface 명{
 * 													(public static final)int x= 10; ->멤버변수는 상수이다
 * 													(public abstract) void disp(); -> 인터페이스의 메소드는 추상 메소드
 *  	
 *  		모든 멤버 변수들;
 *  		모든 멤버 메소드;
 *  	}
 *  	- 클래스는 단일 상속만 가능함					-인터페이스는 다중 상속이 가능한다.
 *  
 * 2. 추상 클래스와 인터페이스의 공통점 
 * 		- 객체를 생성할 수 없다.
 * 		- 상속해서 하위클래스를 통하여 객체를 생성함
 * 		즉, 메소드를 재정의 해야함 
 *  
 */

public class InterfaceEx02 implements Inter3{
	
	int a = 100;
	
	public static void main(String[]args) 
	{
		InterfaceEx02 it = new InterfaceEx02();
		Inter1 it1 = it;	//인터페이스의 다양성 
		Inter2 it2 = it;
		Inter3 it3 = it;
		
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());
	}

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return a + 10;
	}
	
}
