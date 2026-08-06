package com.ForEX001;

public class ForEX0001 {

	public static void main(String[] args) {
		/*
		 * System.out.println("**********"); 
		 * System.out.println("**********");
		 * System.out.println("**********"); 
		 * System.out.println("**********");
		 * System.out.println("**********"); 
		 * System.out.println(); for(int i = 1; i <=5;
		 * i++) { System.out.println("**********"); } 
		 * System.out.println(); for(int j = 1; j <=10; j++) { 
		 * System.out.println("*"); }
		 */
		for(int i = 1; i <=5; i++) { //행 ex) 이 사람은 1행 ~ 5행 
			for(int j = 1; j <=9; j++) { // 열 ex) 이 사람은 1열 ~ 10열
				//System.out.printf("[%d,%d]", i, j);	
				//System.out.printf("%d * %d = %d\n", i, j, i * j); // 구구단이 출력되고, n은 세로 간격으로 출력
				System.out.printf("%d * %d = %d\t\t", i, j, i * j); // t는 가로 간격으로 출력
		}
		System.out.println(); // 열이 끝나고 줄을 바꾼다		
	}

}}
