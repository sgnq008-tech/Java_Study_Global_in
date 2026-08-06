package com.methodex;
/*
 * 
 * 	인자 전달방식
 * 	1. 값에 의한 호출(call by value)
 * 		-메소듣 호출 시 기본 자료형으 값을 인자로 전달하는 방식
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class ValueParameter {

	public int increase(int n) {
		n++;// 매개변수로 전달된 인자값을 증가시킨 후 반환함
		return n;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int var1 = 100;
		
		
		//객체를 생성 
		ValueParameter vp = new ValueParameter();
		int var2 = vp.increase(var1);
		
		System.out.println("var 1 : "+var1);
		System.out.println("var 2 : "+var2);
		
		
		
		
		
		
		
		
		
		
	}

}
