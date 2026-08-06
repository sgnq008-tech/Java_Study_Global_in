package com.ArrayEXexam;
/*문]
 * 
 *      4 x 4 의 2차원 배열을 만들고, 배열에 1 ~ 10까지의 정수를 10개만 
 *      랜덤으로 생성하고, 임의의 위치에 저장하라. 동일한 정수가 있어도 무방하다. 
 *      나머지 6개의 숫자는 모두 0이다. 저장된 2차원 배열에 값을 출력하시오.
 *      
 *      결과
 *     6   0   1   8
 *     0   3   7   2
 *     8   4   0   1
 *     0   0   0   4
 *     
 *     2차원 배열로 작성해보자    
  */
public class ArrayEX10 {

	public static void main(String[] args) {

		int arr[][] = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = 0;
			}
		}

		int n = 0;
		while (n < 10) {

			int r = (int) (Math.random() * 4); // 행
			int c = (int) (Math.random() * 4); // 열

			// 배열에 저장된 값이 0이 아니면 이미 값이 저장되었기 떄문에 건너뜀
			if (arr[r][c] != 0)
				continue;
			else {
				arr[r][c] = (int) (Math.random() * 9 + 1);
				n++; // 생성된 숫자 개수 증가
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
