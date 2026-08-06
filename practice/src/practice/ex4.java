package practice;

public class ex4 {

	public static void main(String[] args) {
          
		/*int(정수형: 정수) 변수끼리 연산하면 int 값이, 
		 * float(실수형: 소수점) 변수끼리 연산하면 float 값이 나옵니다.
		 * 
		 * 하지만 서로 다른 데이터 타입의 변수로 산술 연산을 하면 두 데이터 타입 중 나타낼 수 있는 
		 * 데이터의 범위가 큰 타입으로 값이 나옵니다.
		 * 즉, int 변수와 float 변수끼리 연산하면 float 값이 나옵니다
		 */
		
		System.out.println("7/2=" + 7/2);
		
		System.out.println("7/2.0=" + 7/2.0);

		System.out.println("7.0/2=" + 7.0/2);

		System.out.println("7.0/2.0=" + 7.0/2.0);

		
		System.out.println((float)7/2);
		// float 형으로 변환된 7을 2로 나눈 값
		System.out.println(7/(float)2);
		// 7을 float 형으로 변환된 2로 나눈 값
		System.out.println((float)(7/2));
		// 7을 2로 나눈 값을 float 형으로 변환
		
		System.out.println("3+2*8-4=" + (3+2*8-4));
		// 3+2×8-4=15”를 시스템 콘솔에 출력
		System.out.println("(3+2)*(8-4)=" + (3+2)*(8-4));
		// (3+2)×(8-4)=20”를 시스템 콘솔에 출력 
		System.out.println("3<<2=" + (3<<2));
		// 3<<2=12”를 시스템 콘솔에 출력
		System.out.println("8>>3=" +  (8>>3));
		// 8>>3=1”를 시스템 콘솔에 출력
		
		
		
	}

}
