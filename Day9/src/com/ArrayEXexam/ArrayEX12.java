package com.ArrayEXexam;

import java.util.Scanner;

/* 문]
 *      과목과 정수가 짝을 이루도록 2개의 배열을 작성하시오
 *      
 *      String[] course = {"HTML", "Java","DateBase", "JSP", "Spring"};
 *      int score[] = {95, 88, 76, 62, 55};
 *      
 *      아래와 같이 과목이름을 입력받아 점수를 출력하는 프로그램을 작성하고,
 *      단, 그만을 입력받으면 프로그램을 종료한다.
 *      
 *      과목이름 : Jaba
 *      없는 과목입니다.
 *      
 *      과목이름 : Java
 *      Java 점수는 88입니다.
 *      
 *       과목이름 : Spring
 *      Spring 점수는 55입니다.
 *      
 *      과목이름 : 그만
 *      프로그램을 종료합니다.
 * 
 */

import java.util.*;
public class ArrayEX12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] course = {"HTML", "Java","DataBase", "JSP", "Spring"};
		int score[] = {95, 88, 76, 62, 55};
		
		
		while (true) {
            System.out.print("과목이름 : ");
            String name = sc.next();

            // "그만" 입력 시 종료
            if (name.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break; // return도 대체 가능
            }

            int i;
            
            // 입력한 과목이 배열에 있는지 검색
            for (i = 0; i < score.length; i++) {
                if (course[i].equals(name)) {
                    System.out.println(name+" 점수는 " + score[i] + "입니다.");
                    break; // 과목을 찾았으므로 loop 탈출
                }
            }

            // 끝까지 찾지 못해 i가 배열 크기와 같아졌다면 없는 과목
            if (i == score.length) { // 과목명이 없는 경우
                System.out.println("없는 과목입니다.");
            }
        }
		 
		
		
		

	}

}
