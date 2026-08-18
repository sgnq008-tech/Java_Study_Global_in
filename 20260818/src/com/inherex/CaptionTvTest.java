package com.inherex;

public class CaptionTvTest {

	public static void main(String[] args) {
	CaptionTv ctv = new CaptionTv();
	ctv.channel = 10; //부모클래스로부터 상속 받은 멤버
	ctv.channelUp(); //부모클래스로부터 상속받은 멤버 메소드
	
	System.out.println(ctv.channel);
	ctv.displayCaption("Hello Word");
	ctv.caption=true;
	ctv.displayCaption("Hello Word");
	/*자손 클래스의 인스턴스를 생성하면 조상의 멤버 필드와 자손 클래스의
	 * 멤버가 합쳐진 하나의 인스턴스로 생성된다.
	 * 
	 */
	

	}

}
