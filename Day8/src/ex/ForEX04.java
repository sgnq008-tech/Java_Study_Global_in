package ex;

/*문]
	3의 승수를 입력하여 값을 구하는 프로그램을 작성하시오
	
	결과
	승수 입력 :5
	3의 5승은 243입니다.
*/
import java.util.*;
public class ForEX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*int a = 3;
		int b = 5;
		int c = 1;
		*/
		
		int n,multi = 1; // 곱하기로 설정되면 0으로만 나온다
		System.out.println("승수 입력 :");
		n = sc.nextInt();
		
		
		for(int i = 1; i < n; i++)
			multi *= 3; 
		
		System.out.println( "3의 " + n + "승은 " + multi+ "입니다.");
		/*for(int i = 0; i < b; i++) {
			c *= a;
    }
		 System.out.println(a + "의 " + b + "승 : " + c); */
	}}
