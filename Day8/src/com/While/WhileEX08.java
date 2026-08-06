package com.While;
/*
 * 문]
 *    -1^2+2^2-3^2+4^2-5^2.....+100^2의 합계를 구하는 
 *    프로그램을 작성하시오
 *    단, while문 활용
 *    
 *    결과 : 5050
 */


public class WhileEX08 {

	public static void main(String[] args) {
		
		
		int i = 1, plus = 1, result = 0, result2 = 0;
		
		while(i <= 100){
			/*
			if(i % 2 ==0)
			result += i*i;
			else
			result2 -= i*i;
			*/
			plus = -plus;
			result += plus*(i*i);
		    i++;
		}
	    System.out.println("결과 :"+result);
		//System.out.println("결과 :"+(result+result2));
	}

}
