package com.inherex;

public class CaptionTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		ctv.channel=10; // 부모 클래스로부터 상속받은 멤버 
		ctv.channelUP();//부모 클래스로부터 상복받은 멤버 메소드
		
		
		System.out.println(ctv.channel);
		ctv.displayCaption("헬 로 월드");
		ctv.caption=true;
		ctv.displayCaption("헬로 월드");
		
		/*
		 *	자손 클래스의 인스턴스 를 생성하면 조상의 멤버필드와 자손 클래스의
		 *	멤버가 합쳐진 하나의 인스턴스로 생성된다. 
		 * 
		 */
		
		
		
		
		
		
	}

}
