package com.innerex;

/*
 * Local 이너 클래스]
 * 	- Local 이너 클래스는 특정 메서드 안에 정의되는 클래스를 의미
 * 	- 메서드 안에서 선언되는 지역변수와 같은 곳에 선언
 * 	- 메서드가 호출될 때 생성할 수 있으며, 메서드의 효력이 떨어지면
 * 	  자동으로 소멸
 * 	- 잘 사용되지 않음
 */

public class LocalInner {
	
	// 인스턴스 변수
	int a = 100;
	
	// 멤버 메서드
	public void innerTest(int k) {
		
		// 지역 변수
		int b = 200;
		
		// 상수
		final int c = k;
		
		class Inner {
			
			public void getData() {
				
				System.out.println("int a : " + a);
				System.out.println("int b : " + b);
				System.out.println("final int c : " + c);
				
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
