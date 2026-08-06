/*
 * 숫자열(두 자리이상의 숫자) 입력받기
 * 1. InputStreamReader is = new InputStreamReader(System.in);
 * 2. BufferedReader br = new BufferedReader(is);
 * 3. String s = br.readLine();
 * 4. 문자열을 숫자로 바꾸어 준다(메소드를 활용해서)
 *      int i = Integer.parseInt(s);
 *      
 *      숫자를 문자로 바꾸려면
 *      String ss = String.valueOf(i);
 */

import java.io.*;
public class InputEX05 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, mat, hap = 0;
		
		System.out.print("국어 점수");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수");
		mat = Integer.parseInt(br.readLine());
		
		hap = kor + eng + mat;
		
		System.out.println("합계 : "+hap);
		// 숫자형태로 결과값이 나오고, 문자로하면 에러가 나온다. 이유는 Integer라는 코드가 있긴떄문 



	}

}
