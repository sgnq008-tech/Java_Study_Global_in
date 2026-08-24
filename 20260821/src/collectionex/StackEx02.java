package com.collectionex;

import java.util.*;
public class StackEx02 {

	public static Stack back = new Stack();// 뒤로
	public static Stack forward = new Stack();//앞으로
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		goURL("1.네이버");
		goURL("2.구글");
		goURL("3.다음");
		goURL("4.야후");
		
		display();
		
		goBack();
		System.out.println(" -- 뒤로 버튼을 누른 상태 -- ");
		display();
		
		goBack();
		System.out.println(" -- 뒤로 버튼을 누른 상태 -- ");
		display();
		
		goForward();
		System.out.println(" -- 앞으로 버튼을 누른 상태 -- ");
		display();
		
		
		goURL("globalin.co.kr");
		System.out.println(" -- 새로운 주고로 이동 후 -- ");
		display();
		
		
	}

}
