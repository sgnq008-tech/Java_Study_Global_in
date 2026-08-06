package ex;

import java.util.*;

/*문]
		무한대로 두 정수를 입력받아 합을 구하는 프로그램을 작성하시오.
		단, 0을 입력하면 프로그램을 종료하시오.
		*/
public class ForEX03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		
		for(; ;) { //; ; 무한대: 증가와 감소도 없으며, 무한대로 실행하는 것
			System.out.print("첫번째 정수 : ");
			n1 = sc.nextInt();
			if(n1 == 0) break; // break을 return으로 대체 가능
			System.out.print("두번째 정수 : ");
			n2 = sc.nextInt();
			if(n2 == 0) break;
			System.out.printf("%d + %d = %d\n\n " , n1, n2, (n1+n2));

	}

}}
