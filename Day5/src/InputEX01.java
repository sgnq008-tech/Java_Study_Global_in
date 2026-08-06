
/*
 *  ASCII 코드 입력 받기
 *  System.in.read();
 *  기본적으로 알아야할 아스키 코드(ASCII) 값
 *   '\b' =8, '\t' =9, '\n' =10, '\r' =13,
 *   48 ~ 57 : 0 ~ 9,
 *   65 ~ 90 : A ~ Z,
 *   97 ~ 122 : a ~ z
 */
import java.io.*;
public class InputEX01 {

	public static void main(String[] args) throws IOException{
		System.out.printf("문자입력 :");
		int i = System.in.read(); // 아스키 코드값으로 입력처리됨
		System.out.println("ASCII 코드 값 : "+(char)i);
		// 아스키 코드값을 적용시켜도 문자를 따로 적용시켜주는 코드(char)가 없으면 문자든 숫자든 결과는 전부 숫자로 나온다
		

	}

}
