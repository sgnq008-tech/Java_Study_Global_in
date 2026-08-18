package com.inherex2;
/*다형성
 *  - 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 하는 것
 *  - 부모 클래스 타입의 참조변수로 자식 클래스의 인스턴스를 참조할 수있도록 함
 *  - 부모 클래스 = 자식클래스
 *  
 * 기존방식
 * Super super = new Super();
 * Sub sub = new Sub();
 * 
 * 다형성
 * Super s = new Sub();
 */

class ParentEx
{
	int foo = 5;
	public int getNumber(int a)
	{
		return a + 1; 
	}
}

public class SonEx extends ParentEx{// 아들 클래스
	int foo = 7;
	public int getNumber(int a)
	{
		return a + 2; 
	}
	
	public static void main(String[] args) {
		ParentEx pe = new SonEx();
		// 다형성에서 메소드는 자식, 멤버변수는 부모것을 사용한다.
		System.out.println(pe.getNumber(0));//자식 클래스 메소드
		System.out.println(pe.foo);// 부모클래스의 멤버 변수
		System.out.println("아 GG");
		
	}
}
