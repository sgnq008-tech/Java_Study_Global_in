package com.objectEX;

public class Tvtest {

	public static void main(String[] args) {
		Tv t1; // Tv 인스턴스를 참조하는 변수를 선언
		t1 = new Tv(); // Tv 인스턴스 생성(객체) t가 클래스로부터 만들어진다
		
		Tv t2 = new Tv();  // 
		t1.channel = 3;
		t2.channel = 17;
		System.out.println("t1의 channel 값은 " +t1.channel+"입니다");
		System.out.println("t2의 channel 값은 " +t2.channel+"입니다");
		System.out.println();
		
		//    3 -> 17          17
		 t1.channel = t2.channel;
		System.out.println("t1의 channel 값은 " +t1.channel+"입니다");
		System.out.println("t2의 channel 값은 " +t2.channel+"입니다");
		System.out.println();
		
		t1.channel = 99; // t1의 멤버 변수의 값을 초기화 했다.
		System.out.println("t1의 channel 을 99로 변경합니다.");
		System.out.println("t1의 channel 값은 " +t1.channel+"입니다");
		System.out.println("t2의 channel 값은 " +t2.channel+"입니다");
		System.out.println();	
		 
		t2 = t1; // t1을 저장하고 있는 값을 t2에 저장한다.
		t1.channel = 7; // t1의 멤버 변수의 값을 초기화 했다.
		System.out.println("t1의 channle 값을 7로 변경");
		System.out.println("t1의 channel 값은 " +t1.channel+"입니다");
		System.out.println("t2의 channel 값은 " +t2.channel+"입니다");
		System.out.println();
		
		t1.channelDown(); // Tv의 인스턴스 메소드를 호출합니다. 
		System.out.println("t1의 channel 값은 " +t1.channel+"입니다");
		System.out.println("t2의 channel 값은 " +t2.channel+"입니다");
		System.out.println();
		
		//Tv t1, t2, t3;
		Tv[] tt = new Tv[3]; // 객체 배열  []값을 지정하며, 100개를 지정하면 i가 100개가 나온다 
		
		//								 3
		for(int i =0; i < tt.length; i++) 
		{
			tt[i] = new Tv();
			tt[i].channel = i*10;
			System.out.println("tt["+i+"] : "+ tt[i].channel);
		}
		/*
		 *  변수 : 하나의 데이터를 저장할 수 있는 공간
		 *  배열 : 같은 종류의 데이터를 여러개 저장할 수 있는 공간
		 *  클래스 : 데이터와 함수의 결합체로 여러개의 데이터를 저장할 공간을 만듬
		 */
	}

}
