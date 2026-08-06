package com.ifexam;
/*
 * 문]
 * 사용자로부터 임의의 년도를 입력받아 윤년인지, 평년인지를 판별하는 프로그램 구현하시오
 * 
 * 윤년 판별 조건
 * 1. 년도가 4로 나누어 떨어지면 윤년
 * 2. 년도를 100으로 나누어 떨어지면 평년
 * 3. 년도가 400으로 나누어 떨어지면 윤년
 */

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
		
		int year;
		
		System.out.print("년도:");
		year = sc.nextInt();
		
		// 4로 나누어 떨어지면       100로 나누어 떨어지지않으면    400으로 나누어 떨어지면
		if((year % 4 ==0) && (year % 100 != 0) || (year % 400 ==0)) {
			System.out.println("년은 윤년");
		}else {
			System.out.println("년은 평년");
		}
	}}
