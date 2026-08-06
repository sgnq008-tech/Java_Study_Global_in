package com.ifexam;

import java.util.Scanner;

public class IfEX02 {

	public static void main(String[] args) {
		// if ~ else 문은 if의 조건식이 참인 경우와 거짓인 경우에 각각
		//                             실행한 문장을 다르게 할떄 사용함
	    // if : 참, else: 참이 아날떄
		
		/*
		 * 임의의 정수를 입력받아 짝수인지, 홀수인지를 판정하는
		 * 프로그램을 구현하시오.
		 */
		
	Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("점수 입력 : ");
		n = sc.nextInt();
		
		if(n%2==0) {// 짝수일떄
		   System.out.println(n+"은 짝수");
		} else {// 홀수일떄
			  System.out.println(n+"은 홀수");
      	}
	}
}
