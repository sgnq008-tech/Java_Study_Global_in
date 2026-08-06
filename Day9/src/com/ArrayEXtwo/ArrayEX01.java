package com.ArrayEXtwo;
/*
 *  2차원 배열                                                                  
 *      배열선언 :                                                   행        열
 *      자료형[][]배열명; 또는 자료형 배열명[][]; 또는 자료형[] 배열명[]; 3가지 중 원하는 방식으로 사용해도 됨
 *      자료형[][]배열명 = new 자료형 [행의 크기][열의 크기];
 *       
 *      배열명 = new 자료행 [행의 크기][열의 크기];
 *      배열명 = new 자료행 [행의 크기][]; ---> 가변 배열, 레기드 배열, 비정형 배열
 *      열은 행이 바뀔떄마다 생성
 *      
 *      배열의 초기화
 *      배열명 = {{1,2,3,4,5,},{1,2,3,4,5,}}
 *                           행2개           열5개
 *      배열의 크기 = 행 * 열                     

 *      
 */
public class ArrayEX01 {

	public static void main(String[] args) {
		
		// 방법1
		int[][] arr1 = new int[3][3];
		
		// int 배열에 초기화가 적용됨(값 할당)
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		
		arr1[2][0] = 7;
		arr1[2][1] = 8;
		arr1[2][2] = 9;

		// 배열에 저장된 값을 출력
		
		for(int i = 0; i <arr1.length; i++) { //인덱스가 몇개인가?
			for(int j = 0; j < arr1[i].length; j++) {
				                  //행의 몇번쨰 열이냐?
				System.out.print(arr1[i][j]+"\t");	 
			}
			                   
		}
		System.out.println();
		
		System.out.println();
		int[][] arr2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int i = 0; i <arr2.length; i++) { //인덱스가 몇개인가?
			for(int j = 0; j < arr2[i].length; j++) {
				                  //행의 몇번쨰 열이냐?
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
			//방법
			int[][] arr3 =new int[3][3]; 
			
			int n = 1; // 배열에 반복문을 
			for(int i = 0; i <arr3.length; i++) { //인덱스가 몇개인가?
				for(int j = 0; j < arr3[i].length; j++) {
					arr3[i][j] = n;
					n++;
				}
				System.out.println();	    
	}
	
			for(int i = 0; i <arr3.length; i++) { //인덱스가 몇개인가?
				for(int j = 0; j < arr3[i].length; j++) {
					                  //행의 몇번쨰 열이냐?
					System.out.print(arr3[i][j]+"\t");
				}
				System.out.println();
	
}
}}
