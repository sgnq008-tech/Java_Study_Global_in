package com.abstractex;

/*
 * 추상 클래스의 상속 관계]
 * 	- 추상 클래스들 간에도 상속이 가능함
 * 	- 일반 클래스들 간의 상속과 유사하지만, 추상 클래스들 간의 상속에서는
 * 	  상속받은 추상 메서드들을 반드시 재정의할 필요는 없음
 * 	- 그냥 상속해 두었다가 언젠가 일반 클래스와 상속 관계가 이루어지면
 * 	  그때 재정의하지 못한 상속받은 추상 메서드들을 모두 일반 클래스 내에서
 * 	  재정의해도 됨
 */

abstract class AbsEx01 {
	
	int a = 100;
	
	// 상수
	final String str = "abstract test";
	
	// 일반 메서드(구체화)
	public String getStr() {
		
		return str;
		
	}
	
	// 추상 메서드 선언
	public abstract int getA();
	
}

abstract class AbsEx02 extends AbsEx01 {
	
	// getA() 의 재정의(구체화)
	@Override
	public int getA() {
		
		return a;
		
	}
	
	// getStr() 의 추상 메서드화(추상화)
	public abstract String getStr();
	
}

public class AbsEx extends AbsEx02 {
	
	public static void main(String[] args) {
		
		AbsEx ae = new AbsEx();
		
		System.out.println("ae.getA() : " + ae.getA());
		System.out.println("ae.getStr() : " + ae.getStr());
		
	}
	
	// AbsEx02 의 추상 메서드를 재정의(구체화)
	@Override
	public String getStr() {
		
		// AbsEx01 클래스의 멤버변수
		return str;
		
	}

}
