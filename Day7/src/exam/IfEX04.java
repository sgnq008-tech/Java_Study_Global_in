package exam;
/*
 * 문]
 *  정수 3개를 입력받고, 3개의 숫자 중 
 *  중간크기의 수를 출력하는 프로그램을 구현하시오
 *  
 *  출력결과
 *  첫번쨰 수 : 20 
 *  두번쨰 수 : 100 
 *  세번쨰 수 : 33
 *  중간 값은 33
 *  
 */

import java.util.*;
public class IfEX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("첫번쨰 수 :");
		n1 = sc.nextInt();
		System.out.println("두번쨰 수 :");
		n2 = sc.nextInt();
		System.out.println("세번쨰 수 :");
		n3 = sc.nextInt();
		
		int median = n1;// 처음 중간값을 n1으로 초기화 함

		if((n1) >= 20 || ( n2) <= 20) {// n1이 중간값이 될 수 있는 조건  
			median = n1;
		}else if ((n2) >= 100 || ( n3) <= 100)// n2가 중간값이 될 수 있는 조건
			median = n2;
	    //}else // 그외 중간값은 n3
	    	median = n3;
	    	
			/*
			 * if((n1 >= n2 && n1 <= n3) || (n1 >= n3 && n1 <= n2)){// n1이 중간값이 될 수 있는 조건
			 * median = n1; }else if ((n2 >= n1 && n2 <= n3) || (n2 >= n3 && n2 <= n1))//
			 * n2가 중간값이 될 수 있는 조건 median = n2; //}else// 그외 중간값은 n3 median = n3;
			 */
			//결과
			System.out.println("중간값은" +median);
	

}}
