package ex;

/*문]
	사용자로부터 원하는 단을 입력받아 구구단을 출력하는 프로그램을 작성하시오.
	단, 1 ~ 9단까지의 수만 입력받는다. 범위를 벗어나면 종료한다.
	
	범위는 "2단 ~ 9단까지 만들기"
	
	원하는 단 입력: 7
	7 * 1 = 7
	~
	7 * 9 = 63
*/
import java.util.Scanner;
public class ForEX08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, result = 1;
		System.out.println("원하는 단 입력: ");
		n = sc.nextInt();
		
	     //if(n >= 2 && n <= 9) 의미: n이 2보다 크다 그리고 n은 9보다 작다
		
		     for(int i = 1; i <= 9; i++) {
		    if(n == 10) break;
			System.out.println(n + "*" + i + "=" +n * i);
		}
	    
		
		
				

	}

}
