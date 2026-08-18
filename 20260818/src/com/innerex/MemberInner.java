package com.innerex;
/*Meber 이너 클래스
 * -객체 생성해야만 사용할 수 있는 멤버들과 같은 위쳉 정의되는 클래스를 의미한다.
 *  이너 클래스를 생성하려면 외부클래스의 객체를 생성한 후에 생성할 수있다.
 *  -이너클래스 내부에는 static이 존재할 수 없다.
 *  객체생성
 *  Outer.Inner oi = new Outer().new Inner();
 * 
 */
public class MemberInner {
	int a = 10;
	private int b =100;
	static int c=200;
	
	class Inner {//내부 클래스 
		public void printData()
		{
			System.out.println("int a : "+a);
			System.out.println("int b : "+a);
			System.out.println("static int c : "+a);
		}
	}
	public static void main(String[] args)
	{
		MemberInner.Inner mi = new MemberInner().new Inner();
		mi.printData();
	}

}
