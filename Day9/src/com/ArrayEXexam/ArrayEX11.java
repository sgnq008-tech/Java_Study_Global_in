package com.ArrayEXexam;
/* 문]
 *      반복문을 이용하여 369게임에서 박수를 쳐야하는 경우를 순서대로
 *      화면에 출력하는 프로그램을 작성하시오.
 *      
 *      단. 시작은 1 ~ 99까지로 한다.
 *      
 *      결과
 *      3박수짝
 *      6박수짝
 *      9박수짝
 *      13박수짝
 *      16박수짝
 *      19박수짝
 *      23박수짝
 *      26박수짝
 *      29박수짝
 *      30박수짝
 *      31박수짝
 *      32박수짝
 *      33박수짝짝
 *      34박수짝
 *      35박수짝
 *      36박수짝짝
 *      37박수짝
 *      38박수짝
 *      39박수짝짝
 *      
 *      99박수짝짝
 */
public class ArrayEX11 {

	public static void main(String[] args) {
		String[] str = { "박수짝", "박수짝짝" };
		
		
		
	    
		
		
		
		int result, n, num369 = 0;
		
       for(int i =1; i < 100; i++) {
    	   n = i;
    	   for(result = n % 10; n > 0; result = n % 10) {
    		     // 정수 중에 3, 6, 9 중 하나가 있는 경우 num369를 증가시킨다.
    		   
    		   if(result == 3 || result == 6 || result == 9) {
    			   num369++;
    		   }
    		   n = n /10;
    	   }
    	   if(num369 > 0) { // 정수 중에 3,6,9가
    		   System.out.println(i+" => "+str[num369-1]);
    	   }
    	   num369 = 0;
       }
		

	}

}
