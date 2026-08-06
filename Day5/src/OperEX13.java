
/*
 *  조건 삼항 연산자 
 * 조건항 ? 참일떄 : 거짓일떄;
 */

public class OperEX13 {

	public static void main(String[] args) {
		int a =20;
		int b =30;
		int max = 0;
		
		max = a > b ? ++a : ++b;
		
		System.out.println(max);
		
		

	}

}
