package com.operex;
/*
 * 문]
 * 		사용자로부터 임의의 정수를 입력받아 
 * 		입력받은 정수가 양수인지, 음수인지 ,0 인지 파정하는 프로드그램을 구현하시오.
 * 		단, 삼항 연산자를 활용 하시오 
 * 
 * 
 * 
 */


import java.util.*;
public class OperExam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new  Scanner(System.in); 
		
		int a= 0;
		String b;
		
		
		System.out.print("임의의 정수 : ");
		a = sc.nextInt();
		
		
		
		b = (a > 0) ?  "양수" : (a == 0) ? "0" : "음수" ;
		
		
		System.out.println(b);
		
		
		
	}

}
