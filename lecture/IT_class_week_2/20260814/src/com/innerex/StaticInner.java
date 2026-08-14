package com.innerex;

/*
 * static 이너 클래스]
 * 	- static 이너 클래스로 어쩔 수 없이 정의되는 경우가 많음
 * 	- 이유는 static 변수를 가지고 있다면 어쩔 수 없이 static 으로 선언 되어야 함
 */

public class StaticInner {
	
	int a = 100;
	
	private int b = 200;
	
	static int c = 300;
	
	static class Inner {
		
		static int d = 1000;
		
		/*
		 * 어쩔 수 없이 이너 클래스를 static 으로 선언해야 할 경우]
		 * 	- 내부 클래스의 멤버들 중 하나라도 static 멤버가 있을 때
		 */
		
		public void printData() {
			
			// 오류 : static 이 없기 때문
			// System.out.println("int a :" + a);
			
			// 오류 : static 이 없기 때문
			// System.out.println("private int b :" + b);
			
			System.out.println("static int c :" + c);
			
		}
		
	}

	public static void main(String[] args) {
		
		StaticInner.Inner si = new StaticInner.Inner();
		
		si.printData();

	}

}
