package ex;
/*문]
계승(factorial)을 계산하는 프로그램을 작성하시오.
n 의 계승 n!를 계산

n! = 1 x 2 x 3 x ..... xn

결과
정수입력 : 7
7의 팩토리얼은 5040
*/
import java.util.Scanner;
public class ForEX06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,result = 1;
		System.out.println("정수입력 :");
		n1 = sc.nextInt();
		
		
		for(int i = 1; i <= n1; i++) {
		result *= i; 
		}
		
		System.out.println(n1 + "의 팩토리얼은"+result+"입니다.");
		 

	}

}
