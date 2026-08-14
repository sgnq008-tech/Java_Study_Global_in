package com.inherex;

public class CaptionTv extends Tv {
	
	// 캡션 상태(on / off)
	boolean caption;
	
	void displayCaption(String text) {
		
		// 캡션 상태가 on(true) 일 때만 text 를 보여줌
		if(caption) {
			
			System.out.print(text);
			
		}
		
	}

}
