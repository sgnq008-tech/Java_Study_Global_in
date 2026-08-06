
public class OperEX05 {

	public static void main(String[] args) {
        int a = 1_000_000; // 백만 : 1,000,000
        int b = 2_000_000; // 이백만 : 2,000,000
        
        // int = (int * int) => 결과가 int형이기 떄문에 (-1454759936)
        
        // 변수 a 또는 b의 타입을 long으로 형변환해야한다.
        
        //long c = 1000000L * b;
        // long c =(long) a * 2000000L; 이런식으로 해도 밑에와 같은 값이나온다.
        long c =(long) a * b;
        System.out.println(c);
        
        long k = (long)(1_000_000 *  1_000_000);
        long m = 1_000_000 *  1_000_000L;
        
        System.out.println(k);
        System.out.println(m);

	}

}
