package com.operex;

public class OperExam05 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 7, b=3, imsi;
		
		System.out.println("바꾸기 전 a : "+a+" b : "+b);
		// swap 연산 처리
		/*
		imsi = a;
		a = b;
		b = imsi;
		*/
		
		// XOR 연산처리
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
			
		
		System.out.println("바꾸기 후 a : "+a+" b : "+b);
		
		
		
		
	}

}
