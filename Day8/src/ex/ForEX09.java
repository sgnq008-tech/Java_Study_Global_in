package ex;

/*문]
	사용자로부터 하나의 숫자를 입력받은 다음, 그 수만큼 3의 배수를 출력하는
	프로그램을 작성하시오. 
	
	정수 입력 : 5
	3 6 9 12 15
*/
import java.util.*;
public class ForEX09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("정수 입력 :");
		n = sc.nextInt();
		                 // i와 n 범위
		for(int i = 1; i <= n; i++ ) { 
			System.out.println(i*3+"\t");
		}

	}

}
