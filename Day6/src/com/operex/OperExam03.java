package com.operex;
// 		문]
// 		사용자로부터 임의의 정수를 입력받아 짝수인지 홀수인지를 판정하는 프로그램을 작성 하시오.
//		단, 삼항 연산자를 이용하여 구현하시오.

//		출력
//		임의의 정수 : 17 
//		17 => 홀수

import java.util.*;
public class OperExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new  Scanner(System.in); 
		
		int a = 0;
		String b;
		
		System.out.print("임의의 정수 : ");
		a = sc.nextInt();
		
		b = a%2 == 0 ?  "짝수" : "홀수" ;
		System.out.println(a+"=>"+b);

	}

}
