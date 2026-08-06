package com.ArrayEXtwo;
/* 문]
 *       
 *     1 2 3 4 5
 *     2 3 4 5 6
 *     3 4 5 6 7
 *     4 5 6 7 8
 *     5 6 7 8 9
 */   
public class ArrayEX04 {

	public static void main(String[] args) {
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int [][] arr = new int [5][5];
		
		int n = 1;
		
		// 초기값 및 조건값
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j]= n+j;
			//arr[i][j]= n+j;을  arr[i][j]= n++; 로대신 써도된다
		
			}
			n++;
		// n++; 을 n = i+2; 로대신 써도된다
		}
		// 출력
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					System.out.printf("%3d\t",+arr[i][j]);
			}
				System.out.println();

			}
	}}


