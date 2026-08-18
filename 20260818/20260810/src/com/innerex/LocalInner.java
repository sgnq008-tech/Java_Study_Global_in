package com.innerex;
/*Local 이너 클래스
 *  -Local 이너 클래스는 특정 메소드 안에 정의되는 클래스를 의미한다.
 *  	메소드 안에서 선언되는 지역변수와 같은 곳이 선언된다.
 *  	메소드가 호출될 때 생성할 수 있으며 메소드의 효력이 떨어지면 자동으로 소멸한다.
 *  
 *  -잘 사용되지 않는다.
 * 
 */

public class LocalInner {

	int a= 100;// 인스턴스 변수
	public void innerTest(int k)
	{
		//멤버 메소드
		int b = 200; //지역변수 
		final int c = k; // 상수
		
		class Inner
		{
			public void getData()
			{
				System.out.println("int a :"+a);
				System.out.println("int a :"+b);
				System.out.println("final int c :"+c);
			}
		}
		
		Inner i = new Inner();
		i.getData();
	}

	public static void main(String[] args) {
	LocalInner li = new LocalInner();
	li.innerTest(1000);

	}

}
