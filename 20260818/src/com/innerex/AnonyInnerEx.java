package com.innerex;
/*Anonymous(익명 클래스) 이너 클래스
 * -익명이란> 이름이 없는 것을 의미함
 *  		이것을 자바의 프로그램적으로 해석하면 정의된 클래스의 이름이 없다는 것이 됨
 *  
 *  Event와 관련이 있다. 
 *  interface 구현이 필요 없다.
 * 	-일반 메소드 내부에서 정의부를 가질 수 있다.
 * -abstract 클래스를 상속 받을 수 있다.
 * - 반드시 final 로 선언해야 한다.
 * - implements를 할때는 한 개만 가능핟.
 * 
 * 
 * 
 * 
 */
abstract class TestAbst{
int data = 10000;

public abstract void printData();
}



public class AnonyInnerEx {
	TestAbst inn = new TestAbst()
			{
			public void printData(){
				System.out.println("data:"+data);
			}
};
public static void main(String[] args)
{
	AnonyInnerEx ai = new AnonyInnerEx();
	ai.inn.printData();
		
}
}