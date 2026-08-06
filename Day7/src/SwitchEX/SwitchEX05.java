package SwitchEX;
/*
 * 문]
 *  사용자로부터 임의의 두 정수와 연산자를 입력받아
 *  해당 연산자의 처리 결과를 출력하는 프로그램을 구현하시오.
 *  단, swith ~ case 문으로 구현하시오.
 *  
 *  결과
 *  첫번째 정수 : 2
 *  연산자 입력[+ - * % ] : +
 *  두번쨰 정수 : 3
 *  
 *  2 + 3 = 5
 *  
 */
 
import java.util.*;

public class SwitchEX05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        int num1, num2, result;
		char op;
		
		System.out.print("첫번째 정수 :");
		num1 = sc.nextInt();
		System.out.println("연산자 입력[+ - * % ] :");
		op = sc.next().charAt(0);
		System.out.print("두번째 정수 :");
		num2 = sc.nextInt();
		
	switch (op) {// 연산자
	case '+' : 
		result = num1 + num2;
		break;
	case '-' :
		result = num1 - num2;
		break;
	case '*' :
		result = num1 * num2;
		break;
	case '%' :
		result = num1 % num2;
		break;
		
	default :	
		System.out.println("연산자가 아닙니다.");
		return;
	}
	
	// 결과 출력
	System.out.println();
	System.out.printf("%d %c %d = %d", num1,op,num2,result);

	}

	/*
	 * if(op =='+') { result = num1 + num2;
	 */
}
