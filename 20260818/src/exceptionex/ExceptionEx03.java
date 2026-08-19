package exceptionex;

public class ExceptionEx03 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의 발생~~");
			throw e;// 예외를 발생시킴
		}catch(Exception e) {
			System.out.println("에러메시지:"+e.getMessage());
			e.printStackTrace();
		}
		
	}
}
