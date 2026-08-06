package exam;

/*문]
		원화를 입력받아 달러로 바꾸어 주는 프로그램을 구현하시오
		1$=1400
		
		원화 입력 : 4200
		4200원은 $3.0입니다.
*/
		
import java.util.*;
import java.util.Scanner;
public class IfEX01 {

	public static void main(String[] args) {
		// final: 변수을 고정값으로 저장함(숫자만)
		final double rate = 1400.0;
		Scanner sc = new Scanner(System.in);
		
         System.out.println("원화 입력 :");
         int won = sc.nextInt();
         
         double dollar = won / rate; 
         System.out.println(won+"원은 $" +dollar+ "입니다.");
         
 
	}

}
