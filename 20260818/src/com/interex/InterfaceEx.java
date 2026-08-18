package com.interex;

/*인터페이스
 * 1.인터페이스의 개념
 * - 두 객체가 서로 통신하는 규칙, 약속이고 추상메소드를 사용해서
 *  자식들이 그 메소드를 오버라이딩 하여 사용하도록 만드는 일종의 약속이다.
 *  
 *  2. 인터페이스의 구조
 *  [접근제한자] interface [인터페이스명]
 * 	{
 * 		상수;
 * 		추상 메소드;
 * }
 * 
 * -인터페이스 내에서는 상수 또는 추상 메소드 들만 정의가 가능하다.
 *  인터페이스를 사용하기 위해서는 일반 클래스에서 구현되어야 한다.
 *  즉 다시 말해서 일반 클래스에서 "implement"라는 예약어로 
 *   특정 인터페이스를 구현하겠다고 명시해야함
 *   이렇게 되면 명시한 인터페이스가 가지는 추상 메소드들은 구현받은 
 *   클래스에 하나도 빠짐없이 재정의 해야한다. 
 *   
 *   - 자바의 인터페이스는 모든 메소드가 추상메소드 이고, 
 *   모든 변수는 static 상수이다. 
 *   즉, 인터페이스의 모든 변수는 static이고 final이다.
 *   		만약 붙이지 않으면 컴파일러가 자동으로 인식한다.
 * 
 */

interface InterEx {
	static final int A = 100;
	
	public int getA(); 
	//{return A;}
	
}


public class InterfaceEx implements InterEx {

	public static void main(String[]args)
	{
		InterfaceEx ie =new InterfaceEx();
		System.out.println(ie.getA());
	}

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return A;
	}
}
