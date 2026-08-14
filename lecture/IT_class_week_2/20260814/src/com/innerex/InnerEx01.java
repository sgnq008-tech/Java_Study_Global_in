package com.innerex;

/*
 * 이너 클래스(내부 클래스, 중첩 클래스)]
 * 	1. 이너 클래스의 특징
 * 		- 특정 클래스 내에 또 다른 클래스가 정의되는 것을 의미
 * 		- 이너 클래스가 필요한 이유는 지금까지 작업해 왔던 클래스들과 다르게
 * 		  독립적이지는 않지만 하나의 멤버처럼 사용할 수 있는 특징이 있음
 * 
 * 	2. 이너 클래스를 정의 시 주의사항
 * 		- 이너 클래스는 외부 클래스의 모든 멤버들을 마치 자신의 멤버처럼 사용할 수 있음
 * 		- static 이너 클래스를 제외하고는 다른 이너 클래스는 항상 외부 클래스를 통해야 생성이 가능
 * 
 * 	3. 이너 클래스의 종류
 * 		- member class : 
 * 			1. 외부 클래스의 멤버변수 선언 위치에 선언하며, 외부 클래스의 인스턴스 멤버처럼 다룸
 * 			2. 주로 외부 클래스의 인스턴스 멤버들과 관련된 작업에 사용될 목적으로 선언
 * 		- static class :
 * 			1. 외부 클래스의 멤버변수 선언 위치에 선언하며, 외부 클래스의 static 멤버처럼 다룸
 * 			2. 외부 클래스의 static 멤버, static 메서드에서 사용될 목적으로 선언
 * 		- local class :
 * 			1. 외부 클래스의 메서드나 초기화 블럭 안에 선언
 * 			2. 선언된 영역 내부에서만 사용 됨
 * 		- anonymous class :
 * 			1. 클래스의 선언과 객체의 생성을 동시에 하는 이름 없는 클래스(일회용)
 */

class OuterEx {
	
	public class InnerEx {
		
		int x = 4;
		
	}
	
}

public class InnerEx01 {

	public static void main(String[] args) {
		
		// 외부 클래스의 객체를 먼저 생성
		OuterEx oe = new OuterEx();
		
		// 외부를 통해서 내부 클래스의 객체를 생성
		OuterEx.InnerEx oi = oe.new InnerEx();
		
		System.out.println(oi.x);

	}

}
