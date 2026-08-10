package Class;
/*정수 n이 입력으로 들어오면 1부터 n까지의 합을 구하시오.
 * 
 * 입력: 입력으로 자연수 n이 입력된다.
 * 출력: 1부터 n까지의 합을 출력한다.
 * 
 * 입력: 100
 * 출력: 5050
 */

import java.util.*;
public class SumFrom1ToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i;
		int sum = 0;
		i = 1;
		
		System.out.println("입력 :");
		n = sc.nextInt();
				
		while(i <= n) //얘는 조건이야
		{ 
			sum = sum + i;	
			i++;
		}
		System.out.println(sum);
		
		/*
		 * for(int i = 1; i <= n; i++) 
		 * { sum +=i; }
		 */
		
		//System.out.println(sum);
		
		
		
		

	}

}
