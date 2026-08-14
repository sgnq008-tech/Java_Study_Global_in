package com.innerex;

/*
 * Member 이너 클래스]
 * 	- 객체 생성해야만 사용할 수 있는 멤버들과 같은 위치에 정의되는 클래스를 의미
 * 	- 이너 클래스를 생성하려면 외부 클래스의 객체를 생성한 후에 생성 가능
 * 	- 이너 클래스 내부에는 static 이 존재할 수 없음
 * 
 * 객체 생성]
 * 	Outer.Inner oi = new Outer().new Inner();
 */

// 외부 클래스
public class MemberInner {
	
	int a = 10;
	
	private int b = 100;
	
	static int c = 200;
	
	// 내부 클래스
	class Inner {
		
		public void printData() {
			
			System.out.println("int a : " + a);
			System.out.println("int b : " + b);
			System.out.println("static int c : " + c);
			
		}
		
	}

	public static void main(String[] args) {
		
		MemberInner.Inner mi = new MemberInner().new Inner();
		
		mi.printData();

	}

}
