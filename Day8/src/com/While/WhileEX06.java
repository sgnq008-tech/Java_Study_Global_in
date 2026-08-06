package com.While;
/*
 * 문]
 *    입력된 정수의 평균을 구하는 프로그램을 작성하시오.
 *    먼저 입력할 정수의 개수를 입력받고, 입력받은 정수만큼의
 *    평균을 출력한다. 
 *    입력받은 값은 정수이지만, 평균값은 실수가 될 것임
 *    단, while문 활용
 *    
 *    결과
 *    정수의 개수 : 4
 *    정수 입력 : 2
 *    정수 입력 : 7
 *    정수 입력 : 2
 *    정수 입력 : 4
 *    입력한 정수의 합계 : 3.75
 */

import java.util.*;
public class WhileEX06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i =1, n, s, sum = 0;
		float avg = 0.0f;
		System.out.println("정수의 개수 :");
		n = sc.nextInt();
		
		
		while(i <= n){
			System.out.print("정수입력");
			s=sc.nextInt();
			sum +=s;
			i++;
			
		}
		avg = sum/n;
		System.out.println(avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * int n, s, result = 0; 
		 * float avg = 0f; 
		 * System.out.print("입력할 정수의 개수 :"); 
		 * n = sc.nextInt();
		 * 
		 * for(int i = 1; i <= n; i++) { 
		 * System.out.print("정수입력 :"); 
		 * s = sc.nextInt();
		 * result += s;
		 * 
		 * } avg = (float)result / n; 
		 * System.out.printf("입력한 정수의 평균 : %.2f", avg);
		 */

	}

}
