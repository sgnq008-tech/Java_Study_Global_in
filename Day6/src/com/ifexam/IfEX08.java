package com.ifexam;

/*
 * 문]
 *  두 사람이하는 가위바위보 게임을 만드시오
 *  두 사람의 이름은 철수와 영희로 한다.
 *  먼저 철수를 출력하고 "가위 바위 보" 중 하나의 문자열을 입력받는다
 *  그리고 영희도 "가위 바위 보" 중 하나의 문자열을 입력받는다
 *  입력 받은 문자열을 비교하여 누가 이겼는지를 판별하는 프로그램을 구현하시오.
 *  
 *  입력은 Scanner로 하고, 문자열 비교는 equals()a메소드로 구현하시오. 
 *  
 *  출력 
 *  철수 : 가위
 *  영희 : 보
 *  철수가 이겼습니다.
 */

import java.util.Scanner;

public class IfEX08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a, b;

		System.out.print("철수 :");
		a = sc.next();
		System.out.print("영희 :");
		b = sc.next();

		if (a.equals("가위")) { // 철수가 가위인 경우
			if (b.equals("가위"))
				System.out.println("비겼습니다");
			else if (b.equals("바위"))
				System.out.println("영희가 이겼습니다");
			else
				System.out.println("철수가 이겼습니다");

		} else if (a.equals("바위")) {// 철수가 바위인 경우
			if (b.equals("가위"))
				System.out.println("철수가 이겼습니다");
			else if (b.equals("바위"))
				System.out.println("비겼습니다");
			else
				System.out.println("영희가 이겼습니다");
		} else {// 철수가 보인 경우
			if (b.equals("가위"))
				System.out.println("영희가 이겼습니다");
			else if (b.equals("바위"))
				System.out.println("철수가 이겼습니다");
			else
				System.out.println("비겼습니다");
		}

	}
}
