package com.methodex;
/*
 * 	문]
 * 	1번을 누르면 두개의 정수를 입력받아 그 중 큰 수를 출력하는 기능
 * 	2번을 누르면 두개의 정수를 입력받아 그 사이의 합계를 구하는 기능 
 *	3번을 누르면 세개의 정수를 입력받아 정수가 큰 순서대로 나열 하여 출력하는 프로그램을 구현하시오.
 *	
 * 
 * 
 */

import java.util.Scanner;

public class MethodEx01 {
	static Scanner sc = new Scanner(System.in);
	
	public static int aaa() {
		System.out.print("첫번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int b = sc.nextInt();
		
		if(a>b) {
			return a;
		}
		return b;
	}

	public static void bbb() {
		System.out.print("첫번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int b = sc.nextInt();
		int sum = 0;
		
		if(a>b) {
			a = a^b;
			b = b^a;
			a = a^b;
		}
		
		for(int i=a; i<=b;i++) {
			sum += i;
		}
		
		System.out.println(a+" ~ "+b+"사이의 합계는 "+sum);
		
	}

	public static String ccc(int x, int y, int z) {
		if(y>= x && y>=z) {
				int imsi=x;
				x =y;
				y =  imsi;
		}else if(z >=x&& z>= y){
			int imsi =x;
			x = z; 
			x= imsi;
		}
		
		if(z >= y) {
			int imsi = y;
			y = z;
			y=imsi;
		}
		
	String str =x+">=" +y+">="+z;
	return str;
		
	}
	 static public void finish() {
	      System.out.println("프로그램을 종료합니다.");
	      System.exit(0);
	   }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int x = 0;
	      while (true) {
	         System.out.print("1 : 최대값 2 : 사이합 3: 수나열 4: 종료 =>");
	         x = sc.nextInt();

	         if (x == 1) {
	            int k = aaa();
	            System.out.println("최대값은 " + k + "입니다.");
	         } else if (x == 2) {
	            bbb();
	         } else if (x == 3) {
	            System.out.print("첫번째 수  : ");
	            int i = sc.nextInt();
	            System.out.print("두번째 수  : ");
	            int j = sc.nextInt();
	            System.out.print("세번째 수  : ");
	            int k = sc.nextInt();
	            String s = ccc(i, j, k);
	            System.out.println("큰 순서대로 나열 : " + s);
	         } else if (x == 4) {
	            /*
	             * System.out.println("프로그램을 종료합니다."); return;
	             */
	            finish(); // 위쪽에 피니쉬 메소드를 만들어서 종료 가능
	         } else {
	            System.out.println("다시 입력해주세요.");
	         }
	         System.out.println();
	      }
		
		
		
		
		
		
		
		
		
		
		
	}

}
