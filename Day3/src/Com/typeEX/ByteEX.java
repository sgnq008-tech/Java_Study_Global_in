package Com.typeEX;

/*
 *  byte: 1byte 정수형 , 범위는 -128 ~ 127
 *              byte bb = -129; 에러가 되고 안된다
 *              기본 값 -> 0
 */
		

public class ByteEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bb = 127;
		bb++;
		// Java에서는 컴파일 시 에러가 발생한다.
		// 안정성 때문에 에러가 발생한다.
		System.out.println(bb);

	}

}
