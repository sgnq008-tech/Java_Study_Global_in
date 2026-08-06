package com.methodex;
//문] 계산기 프로그램에서 +,-,*,/,% 등의 연산을 메소드를 이용하여 프로그램을 구현하시오.

import java.util.Scanner;
public class MethodEx02 {
	public static int plus(int x, int y) {
	      return x + y;
	   }
	   public static int minus(int x, int y) {
	      return x - y;
	   }
	   public static int multi(int x, int y) {
	      return x * y;
	   }
	   public static int divi(int x, int y) {
	      return x / y;
	   }
	   public static int per(int x, int y) {
	      return x % y;
	   }
	   
	   public static void display(int a, char b, int c, int d) {
	      System.out.println();
	      System.out.println(a+" "+b+" "+c+"="+d);
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 변수선언
	      int su1 =0,su2=0,tot=0;
	      char you=0;
	      
	      System.out.print("첫번째 수 : ");
	      su1 = sc.nextInt();
	      do {
	         System.out.print("연산자(+,-,*,/,%) : ");
	         you = sc.next().charAt(0);
	      }while(you !='+' && you !='-' && you !='*' && you !='/' && you !='%' );
	      System.out.print("두번째 수 : ");
	      su2 = sc.nextInt();
	      
	      switch(you) {
	      case '+' :
	         tot = plus(su1,su2);
	         break;
	      case '-' :
	         tot = minus(su1,su2);
	         break;
	      case '*' :
	         tot = multi(su1,su2);
	         break;
	      case '/' :
	         tot = divi(su1,su2);
	         break;
	      case '%' :
	         tot = per(su1,su2);
	         break;
	      }
	      display(su1, you, su2, tot);
		
		
		
		
		
		
		
	}

}
