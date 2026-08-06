package com.ArrayEX;
/* 1. 배열개념
 *    1. 배열은 같은 자료형 들끼리 모아두는 하나의 묶음이다.(ex int는 int끼리 뭉치는 것)
 *    2. 자바에서 하나의 배열은 하나의 객체로 인식하다.
 *    3. 동일 자료형이 여러개 반복될때 이를 하나의 변수명으로 관리하며,
 *    각각의 구분은 순차적인 첨자(length인덱스)를 사용한다.
 *    인덱스의 시작은 무조건 0부터 시작한다. 
 *    배열은 기본 자료형이 아닌 참조형 자료형이므로 4byte 크기다. 
 *  
 *  2. 1차원 배열
 *    1차원 배열 선언: int [] 배열명; 또는 int 배열명[]; ([]의 배치는 배열명 앞에든 뒤에든 상관없다.)
 *    배열의 초기화: 배열명 = new 자료형[개수];
 *                       배열명 = {값1, 값2, 값3};
 *         new 연산자에 의해서 할당되면 자동으로 초기화 된다. (ex int면 0으로 초기화된다.) 
 *   
 */
public class ArrayEX01 {

	public static void main(String[] args) {
		
		// 배열 선언
		char[] ch; //문자형 배열
	   
		// 배열 초기화
        ch = new char [4];		
       
        // 배열에 공간에 값을 저장(할당)
       ch[0] = 'J'; // 싱글쿼터(' ')를 적용
       ch[1] = 'A';
       ch[2] = 'V';
       ch[3] = 'A'; // 문자 4개를 ch 배열에 저장했다.
       
       // 배열에 저장된 값을 출력
       for(int i = 0; i < 4; i++) {
    	   System.out.println("ch["+i+"] : " +ch[i]);
       }
       
       // 배열의 사용할떄 반복문도 향상됨
      // for( char aa : ch  ) { // 콜러(:)를 기준으로
    	   //System.out.println("aa : " +aa);
    	System.out.println();   
       for( int aa : ch  ) { // int로 바꾸면 아스키 코드값이 나온다.  
        	   System.out.println("aa : " +aa);
       }

	}

}
