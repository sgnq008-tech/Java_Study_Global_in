package com.ifexam;
/*
 * 삼항연산자
 */

import java.util.Scanner;
public class Exam04 {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
		
      String str;
		int year;
		
		System.out.print("년도:");
		year = sc.nextInt();
		
		/*
		// 4로 나누어 떨어지면       100로 나누어 떨어지지않으면    400으로 나누어 떨어지면
		if((year % 4 ==0) && (year % 100 != 0) || (year % 400 ==0)) {
			System.out.println("년은 윤년");
		}else {
			System.out.println("년은 평년");
		}
		*/
		str = ((year % 4 ==0) && (year % 100 != 0) || (year % 400 ==0)) ? "윤년":"평년";
		System.out.print(year+"년은"+str);

	}}
