package Com.typeEX;

/* Wrappper Class : 기본 데이터형을 Class화 시키는 것
 * 
 * 기본 데이터형  Class화
 * byte          Byte
 * short         Short
 * int             Interger
 * long          Long
 * float          Float
 * double      Double
 * boolean    Boolean
 * char          Character
 */

public class WrapperEX {

	public static void main(String[] args) {
		byte a_min = Byte.MIN_VALUE;
		byte a_max = Byte.MAX_VALUE;
		short s_min = Short.MIN_VALUE;
		short s_max = Short.MAX_VALUE;
		int i_min = Integer.MIN_VALUE;
		int i_max = Integer.MAX_VALUE;
		long l_min = Long.MIN_VALUE;
		long l_max = Long.MAX_VALUE;
		
		int i_size = Integer.BYTES;
	   System.out.println(i_size);
		


		

		
		System.out.println("byte : "+a_min+"~"+a_max);
		System.out.println("short :"+s_min+"~"+s_max);
		System.out.println("int :"+i_min+"~"+i_max);
		




	}

}
