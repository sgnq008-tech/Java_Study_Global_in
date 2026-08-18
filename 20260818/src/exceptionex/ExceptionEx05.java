package exceptionex;
import java.util.*;
import java.io.*;

public class ExceptionEx05 {
	public static void main(String[] args)
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("파일이름:");
//		String s = sc.next();
//		File f = new File(s);
		try {
			File f = new File(args[0]);
			System.out.println(f.getName()+"파일이 성공적으로 생성");
		} catch (Exception e) {
			System.out.println(e.getMessage()+"다시입력해주세요");
				}
	}
//	
//	static File createFile()
//	static void method1() throws Exception{
//		method2();
//	}
//	
//	static void method2() throws Exception{
//		throw new Exception();
//	}
//	
//	public static void main(String[] args)throws Exception {
//		method1();
//		
//		
//	}
	
	static File createFile(String fileName) {
		try {
			if(fileName ==null||fileName.equals(""))
				throw new Exception("파일 이름이 유효하지 않습니다.");
		}catch(Exception e) {
			fileName ="제목없음.txt";
		}finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (Exception e) {
				System.out.println(e);
		}
	}
	
}
