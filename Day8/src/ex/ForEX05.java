package ex;
/*문]
	두개의 정수를 입력받아 그 사이에 존재하는 정수들의 합을 구하는 프로그램 구현하시오.
	
	3과  5를 입력 받는다면 3+4+5의 합이 답이됨

	결과
	첫번쨰 정수 : 4
	두번쨰 정수 : 9
	두 정수 사이에 존재하는 정수들의 합 : 39
*/
import java.util.*;
public class ForEX05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2, sum = 0;
		System.out.print("첫번쨰 정수 :");
		n1 = sc.nextInt();
		System.out.print("두번쨰 정수 :");
		n2 = sc.nextInt();
		
		if(n1 > n2) { //첫번쨰수가 더 큰 경우 두 정수의 자리를 바꾼다
			n1 = n1 ^ n2;
			n2 = n2 ^ n1;
			n1 = n1 ^ n2;
		}
		
		for(int i = n1; i <= n2; i++) {
			sum += i;
		System.out.println("두 정수 사이에 존재하는 정수들의 합 :"+sum);
		
	}

}}
