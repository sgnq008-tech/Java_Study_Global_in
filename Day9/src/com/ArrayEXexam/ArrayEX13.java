package com.ArrayEXexam;
/* 문]
 *      컴퓨터와 사용자 사이의 가위,바위,보 게임을 만들어 보자
 *      
 *      사용자가 먼저 시작하고, 컴퓨터는 랜덤으로 가위, 바위, 보를 하나 선택하는 것으로 한다.
 *      사용자가 입력한 값과 랜덤으로 선택된 값이 비교하여 누가 이겼는지를 판정하는
 *      프로그램을 구현하되 단, 그만을 입력하면 게임이 종료된다.
 *      
 *       결과
 *       가위 바위 보 : 바위
 *       사용자 바위, 컴퓨터 가위, 사용자가 이겼습니다.
 *       
 *       가위 바위 보 : 바위
 *       사용자 바위, 컴퓨터 가위, 사용자가 이겼습니다.
 *       
 *       가위 바위 보 : 바위
 *       사용자 바위, 컴퓨터 가위, 사용자가 이겼습니다.
 *       
 *       가위 바위 보 : 그만
 *       게임을 종료합니다.
 *       
 *       랜덤값 추출
 *       int n = (int) (Math.random() * 3);
 *       
 *       문자열비교: equals() 메소드 사용
 */

import java.util.*;
public class ArrayEX13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] com = {"가위", "바위","보"};
		
		while (true) {
            System.out.print("가위 바위 보 : ");
            String str = sc.next(); // str 본인

         
            if (str.equals("그만")) { // while문을 빠져나가는 조건문
                System.out.println("게임을 종료합니다.");
                break; // return도 대체 가능
            }
            int n = (int) (Math.random() * 3);
            String b = com[n]; // b는 컴퓨터
            
            System.out.println("사용자 :" +str+ ",컴퓨터 :" +b );
            
            if(str.equals("가위")) { // 사용자가 가위인 경우
            	if(b.equals("가위"))
            		System.out.println("비겼습니다.");
            	else if(b.equals("바위"))
            	    System.out.println("컴퓨터가 이겼습니다.");
            	else
            		System.out.println("사용자가 이겼습니다.");
            	
            }else if(str.equals("바위")) { // 사용자가 바위인 경우
            	if(b.equals("가위"))
            		System.out.println("사용자가 이겼습니다.");
            	else if(b.equals("바위"))
            	    System.out.println("비겼습니다.");
            	else
            		System.out.println("컴퓨터가 이겼습니다.");
   
            
            }else if(str.equals("보")) { // 사용자가 보인 경우
            	if(b.equals("가위"))
            		System.out.println("컴퓨터가 이겼습니다.");
            	else if(b.equals("바위"))
            	    System.out.println("사용자가 이겼습니다.");
            	else
            		System.out.println("비겼습니다.");
            
            }else  // 가위, 바위, 보 외에는 "다시 하세요"라고 입력시킨다.
            	System.out.println("다시 하세요"); 
            
            

		

	}

}}
