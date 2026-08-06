package com.ArrayEXtwo;
/*문]
 *     2차원 배열을 활용하여 아래같이 출력되도록 프로그램을 구현하시오.
 *     
 *     1 2 3 4 5
 *     6 7 8 9 10 
 *     11 12 13 14 15
 *     16 17 18 19 20
 *     21 22 23 24 25
 */
public class ArrayEX03 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		// 배열선언
		int [][] arr = new int [5][5];
		
		// 데이터 저장
		int n = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				arr[i][j]= n++; // 출력을 의미
				}			
		}	
		// 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				System.out.printf("%3d\t",arr[i][j]); // 출력을 의미
			}
			System.out.println();
		}

	}

}
