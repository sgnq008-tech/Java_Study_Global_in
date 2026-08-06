package com.ifexam;

import java.util.Scanner;

/*
 *  다중 if ~ else
 *    - if ~ else 가 연속되는 것을 의미한다
 *    조건이 참인경우 다른 조건일 경우 다 조건식을 만든다.
 *    
 *    형식
 *    if(조선식1){
 *      실행 1
 *    }else if (조건식2){
 *       실행2
 *    }else if (조건식3){
 *       실행3
 *    }else {
 *       위의 조건식이 모두 거짓일 경우
 *       실행
 *    }
 */

/*
 * 성적을 입력받아 학점을 판정하는 프로그램을 작성하시오.
 * A => 90이상, B=> 80이상, C=> 70이상, D=> 60이상, F=> 60점 이하 
 */

public class IfEX03 {

	public static void main(String[] args) {
		// 점수를 저장할 변수
		int score;
		// 학점를 저장할 변수
		char grade;
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("점수 입력:");
		score = sc.nextInt();
		
		if(score >=90) {
			grade='A';
		}else if(score >=80){
			grade='B';
		}else if(score >=70){
		    grade='C';
		}else if(score >=60){
		    grade='D';
		}else {
		    grade='F';
        }
     System.out.println("당신의 점수는 "+score+"이고,학점은 "+grade+"입니다.");
	}}
