package com.inherex;

public class CaptionTv extends Tv{
	
	boolean caption;//캡션 상태 (on/off)
	
	void displayCaption(String text) {
		if(caption){// 캡션상태가 on(true) 일때만 text를 부여줌 
			System.out.println(text);
		}
	}

}
