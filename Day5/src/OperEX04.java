
public class OperEX04 {

	public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);// 컴파일 에러
        // a + b의 연산결과는 int형이다.
        // 4byte의 값을 1byte 변수에 저장하려면 형변환이 필요하다.
	}

}
