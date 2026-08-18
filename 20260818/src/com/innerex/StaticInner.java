package com.innerex;

/*static 이너 크래스
 * -static 이너 클래스로 어쩔 수 없이 정의되는 경우가 많다.
 * 이유는 static 변수를 가지고 있다면 어쩔 수 없이 static 으로 선언 되어야 한다.
 * 
 */

public class StaticInner {
	int a =100;
	private int b =200;
	static int c = 300;
	
	static class Inner{
		static int d = 1000;
		/*어쩔 수 없이 이너 클래스를 static 
		 * 
		 */
		public void printData()
		{
			System.out.println("int a :"+a); //오류 
			System.out.println("private b :"+b); //오류
			System.out.println("static int c :"+c);
		}
	}
	public static void main (String[]args)
	{
		StaticInner.Inner si = new StaticInner().Inner();
		si.printData();
	}

}
