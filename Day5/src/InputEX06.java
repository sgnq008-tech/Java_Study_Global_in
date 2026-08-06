/*
 *  이름 ,나이, 전번, 주소를 입력받아 
 *  단, 입력은  BufferedReader
 */
		


import java.io.*;
public class InputEX06 {

	public static void main(String[] args) throws IOException{
		
		String name, tel, address;
		int age;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 :");
		name = br.readLine();
		System.out.print("나이 :");
		age = Integer.parseInt(br.readLine());
		System.out.print("전번 :");
		tel = br.readLine();
		System.out.print("주소 :");
		address = br.readLine();
		
		System.out.print("나의 이름은"+name+"이며,나이는"+age+"이고"+"전번은"+tel+ 
				                    "번호 이고, 사는 곳은 " +address+"입니다.");
		

	}

}
