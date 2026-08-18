package com.inherex2;

/* 상속에서의 생성자 : super()
 * 
 * 		-자식의 기본 생성자에는 super()가 생략 되어 있음
 *  	-인스턴스(객체)생성시 무조건 부모 클래스부터 생성자가 생성됨
 *  	- 즉, 부모의 생성자를 무조건 먼저 호출함
 *   	-this(), super()는 생성자의 가장 위에 명시해야한다.
 * 
 */
public class NumberTwo extends NumberOner {
	
	public NumberTwo()
	{
		super(5);
		System.out.println("자식클래스의 생성자 ...");
	}

}
