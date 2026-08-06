package com.While;
/*
 * 문]
 *    -1^2+2^2-3^2+4^2-5^2.....+100^2의 합계를 구하는 
 *    프로그램을 작성하시오
 *    단, while문 활용
 *    
 *    결과 : 5050
 */

import java.util.*;
public class DoWhileEX08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1, plus = 1, result = 0, result2 = 0;
		
		do{
			/*
			if(i % 2 ==0)
			result += i*i;
			else
			result2 -= i*i;
			*/
			plus = -plus;
			result += plus*(i*i);
		    i++;
		}while(i <= 100);
	    System.out.println("결과 :"+result);
		//System.out.println("결과 :"+(result+result2));
	}

}