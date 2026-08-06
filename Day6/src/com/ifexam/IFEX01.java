package com.ifexam;

import java.util.*;
public class IFEX01 {

	public static void main(String[] args) {
// 시험 점수가 80점 이상이라면 합격을 판정하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.println("점수 입력 : ");
		score = sc.nextInt();
		
		// 단수 if : 명령어가 하나만 처리한 경우
		if(score >= 80)
			System.out.println("합격!");
	}

}
