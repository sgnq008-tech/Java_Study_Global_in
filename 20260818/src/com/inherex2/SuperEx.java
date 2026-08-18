package com.inherex2;
/*super
 *  - 부모 객체의 참조를 의미함
 *  - 부모 클래스의 멤버와 자손 클래스의멤버가 서로 중복 정의 되어 있으면
 *  	서로 구별해야하는 경우에만 super를 사용하는 것이 좋다. 
 */
class Super{
	int a =5;
}

class Sub extends Super
{
	int a=10;
	public void test()
	{
		System.out.println(this.a);//sub class(자식클래스)
		System.out.println(super.a);//super class (부모 클래스)
	}
}

public class SuperEx {

	public static void main(String[] args) {
		Sub s = new Sub();
		s.test();
		

	}

}
