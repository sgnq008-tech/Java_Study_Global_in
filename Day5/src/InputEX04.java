/*
 * 문자열 입력받기(하나이상의 문자 입력받기)
 * 1. InputStreamReader is = new InputStreamReader(System.in);
 * 2. BufferedReader br = new BufferedReader(is);
 * 3. String s = br.readLine();
 */

import java.io.*;
public class InputEX04 {

	public static void main(String[] args) throws IOException{
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름입력:");
		String name = br.readLine();
		System.out.println(name);

	}

}
