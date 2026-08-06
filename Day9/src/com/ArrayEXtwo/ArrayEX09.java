package com.ArrayEXtwo;
/* 문]
 *     5명의 학생이 3과목 점수를 더해서 각 학생별 총점과 평균을 계산하고,
 *     과목별 총점을 계산하는 프로그램을 구현하시오.
 *     
 *     1 -> 100,   100,    100
 *     2 -> 20,      20,      20
 *     3 -> 30,      30,      30
 *     4 -> 40,      40,      40
 *     5 -> 50,      50,      50
 *          
 *           240      240     240 (과목별 총점)
 */
public class ArrayEX09 {

	public static void main(String[] args) {
		int [][] score = { // 초기값 설정
				{100, 100,  100},
				{20,    20,    20},
				{30,    30,    30},
				{40,    40,    40},
				{50,    50,    50}
		};
		
		// 과목별 총점을 저장할 변수를 선언
		int korTot = 0, engTot= 0, matTot=0;
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("===============");
		for(int i=0; i < score.length; i++) {
			
			// 개인별 촘점을 저장할 변수
			int sum = 0;
			
			// 개인별 평균을 저장할 변수
			float avg = 0.0f;
			
			// 각 과목별 총점을 구함
			korTot +=score[i][0];
			engTot +=score[i][1];
			matTot +=score[i][2];
			System.out.printf("%3d",i+1);
			for(int j =0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d",score[i][j]);
			}
			avg = sum / (float)(score[i].length);
			System.out.printf("%5d %5.1f%n",sum,avg);
		}
		System.out.println("===============");
		System.out.printf("총점 : %3d %3d %3d%n", korTot, engTot, matTot);

	}

}
