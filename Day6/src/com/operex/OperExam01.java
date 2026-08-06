package com.operex;
//				문]
//						사용자로 부터 임의의 정수를 두번 입력 받아 사칙연산 및 나머지를 구하는 프로그램을 작성하시오 . 
//						출력결과 
//						첫번째 정수 입력 : 10 
//						두번째 정수 입력 : 2
//						
//						10 + 2 = 12 
//						10 - 2 = 8
//						10 * 2 = 20
//						10 / 2 = 5
//						10 % 2 = 0


import java.io.*;
import java.util.*;
public class OperExam01 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		/*
		//BufferedReader 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//변수 선언
		int a,b,c,d,e,f,g;
		
		//입력처리
		System.out.print("첫번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		//연산처리
		c = a+b;
		d = a-b;
		e = a*b;
		f = a/b;
		g = a%b;
		
		
		//결과출력
		System.out.printf("%d + %d = %d\n",a,b,c);
		System.out.printf("%d - %d = %d\n",a,b,d);
		System.out.printf("%d * %d = %d\n",a,b,e);
		System.out.printf("%d / %d = %d\n",a,b,f);
		System.out.printf("%d %% %d = %d\n",a,b,g);
		*/
		
		
		
		
		
		//Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int a,b,c,d,e,f,g;
		
		//입력처리
		System.out.print("첫번째 정수 입력 : ");
		a = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		b = sc.nextInt();
		
		//연산처리
		c = a+b;
		d = a-b;
		e = a*b;
		f = a/b;
		g = a%b;
		
		//결과출력
		System.out.printf("%d + %d = %d\n",a,b,c);
		System.out.printf("%d - %d = %d\n",a,b,d);
		System.out.printf("%d * %d = %d\n",a,b,e);
		System.out.printf("%d / %d = %d\n",a,b,f);
		System.out.printf("%d %% %d = %d\n",a,b,g);
		
		
		
	}

}
