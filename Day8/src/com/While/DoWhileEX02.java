package com.While;

import java.util.*;


public class DoWhileEX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, s, result = 0;
		char op = ' ';
		
		System.out.println("첫번쨰 정수: ");
		n = sc.nextInt();
		
		do {
			System.out.println("연산자(+, -, *, /) : ");
			op = sc.next().charAt(0);
		}while(op !='+' && op !='-' &&  op !='*' &&  op !='/');
		
		
		do {
		System.out.println("두번쨰 정수: ");
		s = sc.nextInt();
		}while(op == '/' && s ==0);
		
		switch(op) {
			case '+' :result = n + s; break;
			case '-' :result = n - s; break;
			case '*' :result = n * s; break;
			case '/' :result = n / s; break;
		}
		
		System.out.println(n + " "+op+ " " +s+"="+result);
		

		

	}

}
