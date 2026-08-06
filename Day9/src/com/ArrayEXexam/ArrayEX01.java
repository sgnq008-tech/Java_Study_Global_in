package com.ArrayEXexam;
/*문]
 *    아래와 같이 출력되도록 프로그램을 구현하시오.
 *    단, 2차원 배열로 구현하시오.
 *    
 *    1
 *    1  2  3
 *    1
 *    1  2  3  4
 *    1  2
 *    
 *    행 5, 열 4
 */   
public class ArrayEX01 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		int [][] arr = {
				{1},
				{1,  2,  3},
				{1},
				{1,  2,  3,  4},
				{1,  2}
			};
	
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d\t", arr[i][j]);
			}
			System.out.println();
		}
		

	}

}
