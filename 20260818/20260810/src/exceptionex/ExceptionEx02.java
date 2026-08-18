package exceptionex;

public class ExceptionEx02 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			
			//에러 나면 바로 catch문으로 4는 못읽음 
			System.out.println(4);
		}catch(Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
	}

}
