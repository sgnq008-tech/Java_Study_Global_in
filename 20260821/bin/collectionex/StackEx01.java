package com.collectionex;
import java.util.*;
public class StackEx01 {
	
	private static final String colors[]= 
		{"검정","노랑","녹색","파랑","주황색","연두색"};
	
	public StackEx01() {
		Stack<String> st = new Stack<>();
		
		for(String color : colors) {
			st.push(color);//스텍에 저장
		}
		popStack(st);
		
	}
	
	public void popStack(Stack<String>s) {
		System.out.print("pop : ");
		while(!s.empty()) {//스텍이 비어있지 않으면 
			System.out.print(s.pop()+"");
		}
	}
	
	public static void main(String[] args) {
		new StackEx01();

	}

}
