package com.ifexam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*문]
 *  사용자로부터 이름, 국어, 영어, 수학, 점수를 입력받아
 *  총점과 평균을 구한후 학점을 판정하는 프로그램을 작성하시오
 *  A => 90이상, B=> 80이상, C=> 70이상, D=> 60이상, F=> 60점 이하는 모두
 *  결과
 *  이름: 홍길동
 *  국어: 10
 *  영어: 10
 *  수학: 10
 *  
 *  당신의 홍길동이며, 총점은 30점이고, 평균은 10점입니다.
 *  학점은 F입니다. 
 */
import java.util.*;
public class Exam01 {

	public static void main(String[] args) {
		
		// 1. 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
	
		char grade;
		
		// 입력 받아 저장할 변수 선언
		int score, kor, eng, mat, hap = 0;
		
		String name;
		
		// 안내문자 출력 및 스캐너로 데이터 입력받아 저장 
		System.out.print("이름 :");
		name = sc.nextLine();
		
		System.out.print("국어 :");
		kor = sc.nextInt();
		System.out.print("영어 :");
		eng = sc.nextInt();
		System.out.print("수학 :");
		mat = sc.nextInt();
		
		// 총점
		hap = kor + mat + eng;
		
		// 평균
		score = hap / 3;
		
		// 학점
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
		
	// 출력	
     System.out.println("당신의" +name+ "총점은"+hap+"이고,평균은"+score+ "학점은 "+grade+"입니다.");
	}

}
