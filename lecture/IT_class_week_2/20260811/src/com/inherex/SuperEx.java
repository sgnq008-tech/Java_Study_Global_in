package com.inherex;

/*
 * super]
 * 	- 부모 객체의 참조를 의미
 * 	- 부모 클래스의 멤버와 자손 클래스의 멤버가 서로 중복 정의 되어 있으면
 * 	  서로 구별해야 하는 경우에만 super 를 사용
 */

class Super {
	
	int a = 5;
	
}

class Sub extends Super {
	
	int a = 10;
	
	public void test() {
		
		// Sub class -> 자식 클래스
		System.out.println(this.a);
		
		// Super class -> 부모 클래스
		System.out.println(super.a);
		
	}
	
}

public class SuperEx {

	public static void main(String[] args) {
		
		Sub s = new Sub();
		
		s.test();

	}

}
