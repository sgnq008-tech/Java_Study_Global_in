package com.ArrayEXtwo;
/* 문]
 *      세명의 학생 중에 한명당 세과목을 점수를 입력받아
 *      총점, 평균, 석차를 구하는 프로그램을 작성하시오.
 */

import java.util.*;
public class ArrayEX08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] subname = {"국어","영어","수학"	};
		
		int[][]sub = new int[3][subname.length+2];
		/* int[][]sub = new int[3][subname.length+2];
		 * [3] ->  세명을 의미하는 것 -> 0:첫번쨰 사람, 1:두번쨰 사람, 2:세번쨰 사람
		 * [subname.length+2]
		 *    국어, 영어, 수학, 합계, 석차
		 *      0     1      2    +1   +2
		 *      
		 *      국어, 영어, 수학만 구하면 되니 합계, 석차는 열에 포함 안시켜도 된다.
		 *      평균은 3명이까 3개 나와야 한다.
		 *      
		 */

		float[] avg = new float[3];
		
		// 각 사람에대한 과목별 점수를 입력받는다.
		for(int k = 0; k < sub.length; k++) { // 0, 1, 2는 사람을 의미한다.
			System.out.println((k+1)+"번쨰 사람");
			for(int i = 0; i < sub[k].length-2; i++) {
				//과목 및 합계를 저장한 공간을 변수 i
				
				do { // 각 과목 별 점수를 입력하는 것
					System.out.println(subname[i]+"점수 :");
					sub[k][i] = sc.nextInt();
				}while(sub[k][i] < 0 || sub[k][i] >100);
				// 합계
				sub[k][sub[k].length-2] += sub[k][i]; // k는 학생을 의미하고, i는 과목을 의미함
			}// 한 사람의 과목 점수가 입력 작업이 끝남
			
			avg[k] = sub[k][sub[k].length-2] / (float)(sub[k].length-2);// 합계
			sub[k][sub[k].length-1] = 1;   // 총점
			}
		
		// 석차구하기
		for(int k = 0; k < sub.length; k++) {
			for(int i = 0; i < sub.length; i++) {
				if(sub[k][sub[k].length-2] < sub[i][sub[i].length-2]) {
					sub[k][sub[k].length-1]++;
					
				}
			}
		}
		
		// 출력
		System.out.println();
		for(int k = 0; k < sub.length; k++) {
			System.out.println();
			System.out.println(sub[k][sub[k].length-1] + "등");
			System.out.println("총점 :"+ sub[k][sub[k].length-2]);
			System.out.printf("평균 : %.2f", avg[k]);
		}
}}
