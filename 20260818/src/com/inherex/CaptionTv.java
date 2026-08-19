package com.inherex;

public class CaptionTv extends Tv{
	//캡션 상태 (on/off)
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) 
		{	//캡션 상태가 on(true)일때 
			System.out.println(text);
		}
	}

}
