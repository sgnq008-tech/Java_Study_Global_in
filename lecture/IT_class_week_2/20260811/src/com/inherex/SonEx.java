package com.inherex;

/*
 * 다형성]
 * 	- 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 하는 것
 * 	- 부모 클래스 타입의 참조변수로 자식 클래스의 인스턴스를 참조할 수 있도록 함
 * 	- 부모 클래스 = 자식 클래스
 * 
 * 기존 방식]
 * 	Super super = new Super();
 * 	Sub sub = new Sub();
 * 
 * 다형성 방식]
 * 	Super s = new Sub();
 */

// 부모 클래스
class ParentEx {
	
	int foo = 5;
	
	public int getNumber(int a) {
		
		return a + 1;
		
	}
	
}

// 아들 클래스
public class SonEx extends ParentEx {
	
	int foo = 7;
	
	public int getNumber(int a) {
		
		return a + 2;
		
	}

	public static void main(String[] args) {
		
		ParentEx pe = new SonEx();
		
		// 다형성에서 메서드는 자식, 멤버변수는 부모 것을 사용
		System.out.println(pe.getNumber(0)); // 자식 클래스 메서드
		System.out.println(pe.foo); // 부모 클래스 멤버변수(속성 = 필드)

	}

}
