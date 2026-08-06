package exam;

/*문]
	2자리 정수(10 ~ 99)를 입력받고, 10자리와 
	1의자리가 같은지를 판별하는 프로그램을 구현하시오.
	
	결과
	2자리 정수 입력 : 77
	10의 자리와 1의 자리가 같습니다.
	10의 자리는 7
	
	/ => 10의자리 (7)
	 % => 1의 자리 (7)
	
*/

import java.util.*;
public class IfEX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10 ~ 99 사이의 정수를 입력하세요:");
		int n = sc.nextInt();
		
		if( n<10 || n > 99) {
			System.out.println("10 ~ 99 사이의 정수만 입력하시오");
			return;
			
		}
		
		int ten = n / 10; // 10의 자리
		int one = n % 10; // 1의 자리
			
			if(ten == one) {
				System.out.println("10의 자리와 1의 자리가 같습니다.");
			}else {
				System.out.println("10의 자리와 1의 자리가 같지 않습니다.");
			}
		}
		
		
		/*
		 * if (n >= 10 && n <= 99) { System.out.println(n % 10 ); }esle if
		 */
	
	}

