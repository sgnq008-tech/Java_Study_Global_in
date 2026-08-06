package com.ifexam;
/*
 * 문]
 * 사용자로부터 임의의 정수 세개를 입력받아
 * 작은 수부터 큰수 순으로 출력하는 프로그램을 구현하시오.
 * 단, swap을 이용하여 구현
 * 
 *  결과: 
 *  첫번쨰 수: 16
 *  두번쨰 수: 8
 *  세번쨰 수: 21
 *  정렬결과: 8 16 21
 */

import java.io.*;
import java.util.*;

public class IfEX05 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		int a, b, c, temp;
		
		
		System.out.println("첫번쨰 수 :");
		a =sc.nextInt();
		System.out.println("두번쨰 수 :");
		b = sc.nextInt();
		System.out.println("두번쨰 수 :");
		c = sc.nextInt();
		
	if(a > c) {
		temp = a;
		a = c;
		b= temp;
		
	}
	
		
	if(a > b) {
		temp = a;
	    a = b;
	    b= temp;
	}
	
	 if(b > c) {
		 temp = b;
	     b = c;
	     c = temp;
	 }
	 
		System.out.println();
		System.out.println("정렬결과 : "+a+""+b+ ""+c);
		

	}

}
