package com.interex;

/*
 * 추상 클래스와 인터페이스]
 * 	1. 추상 클래스와 인터페이스의 차이점
 * 		abstract class class명 {		/		interface interface명 {
 * 			모든 멤버 변수들;			/			(public static final) int x = 10; <- 인터페이스의 멤버 변수는 상수
 * 			모든 멤버 메서드;			/			(public abstract) void disp(); <- 인터페이스의 메서드는 추상
 * 		}							/		}
 * 		- 단일 상속만 가능				/		- 다중 상속이 가능
 * 
 * 	2. 추상 클래스와 인터페이스의 공통점
 * 		- 객체를 생성할 수 없음
 * 		- 상속해서 하위 클래스를 통하여 객체를 생성
 * 		- 즉, 메서드를 재정의(구체화) 해야 함
 */

public class InterfaceEx02 implements Inter03 {
	
	int a = 100;

	public static void main(String[] args) {
		
		InterfaceEx02 it = new InterfaceEx02();
		
		// 인터페이스의 다형성
		Inter01 it1 = it;
		Inter02 it2 = it;
		Inter03 it3 = it;
		
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());

	}

	// Inter01, Inter02 추상 메서드 재정의(구체화)
	@Override
	public int getA() {
		
		return a;
		
	}

	// Inter03 추상 메서드 재정의(구체화)
	@Override
	public int getData() {
		
		return a + 10;
		
	}

}
