package com.exam;

import java.util.Scanner;

/* 문]
 *     Grade 클래스를 작성하시오.
 *     
 *     세과목을 점수를 입력받아 Grade객체를 생성하고, 성적 평균을 출력하는 프로그램을 작성하시오.
 *     
 *     
 *      결과
 *      국어, 영어, 수학점수 입력 : 90 88 96
 *      평균은 91
 *      
 *      힌트: Grade클래스에 int타입의 kor,eng,mat필드를 private로 선언하고,
 *      생성자와 세과목의 평균을 리턴하는 average()메소드를 작성하면 된다.
 * 
 */
import java.util.*;
public class GradeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 영어, 수학점수 입력 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		Grade me = new Grade(kor,eng,mat);
		System.out.println("평균은" +me.average());

	}

}
