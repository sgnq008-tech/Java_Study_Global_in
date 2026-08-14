package com.interex;

/*
 * 인터페이스]
 * 	1. 인터페이스의 개념
 * 		- 두 객체가 서로 통신하는 규칙, 약속
 * 		- 추상 메서드를 사용해서 자식들이 그 메서드를 오버라이딩하여
 * 		  사용하도록 만드는 일종의 약속
 * 
 * 	2. 인터페이스의 구조
 * 		[접근제한자] interface [인터페이스명] {
 * 			상수;
 * 			추상 메서드;
 * 		}
 * 		- 인터페이스 내에서는 상수 또는 추상 메서드들만 정의가 가능
 * 		- 인터페이스를 사용하기 위해서는 일반 클래스에서 구현되어야 함
 * 		- 즉, 다시 말해서 일반 클래스에서 "implements" 라는 예약어로
 * 		  특정 인터페이스를 구현하겠다고 명시
 * 		- 명시한 인터페이스가 가지는 추상 메서드들은 구현 받은 클래스에서
 * 		  하나도 빠짐 없이 재정의(구체화) 해야 함
 * 		- Java 의 인터페이스는 모든 메서드가 추상 메서드이고,
 * 		  모든 변수는 static 상수
 * 		- 즉, 인터페이스의 모든 변수는 static 이고 final
 * 		- 붙이지 않으면 컴파일러가 자동으로 인식
 */

// 인터페이스 내에는 일반 메서드가 올 수 없음
interface InterEx {
	
	static final int A = 100;
	
	abstract int getA();
	
}

public class InterfaceEx01 implements InterEx {

	public static void main(String[] args) {
		
		InterfaceEx01 ie = new InterfaceEx01();
		
		System.out.println(ie.getA());

	}

	@Override
	public int getA() {
		
		return A;
		
	}

}
