package ex;

/*문]
	입력받은 정수의 평균을 구하는 프로그램을 구현하시오.
	먼저 입력할 정수의 개수를 사용자로부터 입력받는다.
	그리고 그 수만큼 정수를 입력받아 평균을 구하고 출력한다. 
	
	단, 입력값은 정수이지만, 출력값은 실수가 될 수 있다.
	
	결과
	입력할 정수의 개수 : 4
	정수입력 : 2
	정수입력 : 7
	정수입력 : 2
    정수입력 : 4
    입력한 정수의 평균 : 3.750000
*/
import java.util.*;
public class ForEX10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, s, result = 0;
		float avg = 0f;
		System.out.print("입력할 정수의 개수 :");
		n = sc.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
		System.out.print("정수입력 :");
		s = sc.nextInt();
		result += s;
		
		}
		avg = (float)result / n;
		System.out.printf("입력한 정수의 평균 : %.2f", avg);
}}
