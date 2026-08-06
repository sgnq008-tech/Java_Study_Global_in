package com.While;

import java.util.*;
public class DoWhileEX05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 1, sum= 0;
		
		int count = 0;
		 do{
			System.out.print("정수 입력 - > 0 종료 :");
			n = sc.nextInt(); 
			sum += n;
			count++;
		}while(n !=0);
		
		System.out.println("정수 전체합계 :" +sum);
		System.out.println("평균값"+(sum/count) );

	}

}
