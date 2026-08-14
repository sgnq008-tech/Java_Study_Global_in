package com.inherex;

public class CaptionTvTest {
	
	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		
		// 부모 클래스로부터 상속 받은 멤버
		ctv.channel = 10;
		
		// 부모 클래스로부터 상속 받은 멤버 메서드
		ctv.channelUp();
		
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello World");
		
		ctv.caption = true;
		
		ctv.displayCaption("Hello World");
		
		/*
		 * 자손 클래스의 인스턴스를 생성하면 조상의 멤버필드의 자손 클래스의
		 * 멤버가 합쳐진 하나의 인스턴스로 생성됨
		 */
		
	}

}
