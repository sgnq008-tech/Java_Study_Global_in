package Com.typeEX;
/* char: 2byte -> 주로 unicode 사용
 *                        아스키 코드, 
 * 아스키 코드: 1byte 문자를 표현, 0 ~ 255 까지 문자 표현 
 * 유니코드: (세계 표준 문자) : 2byte 문자를 표현, 0 ~ 65535 까지의 문자
 *      - 세계 여러 국가의 문자들(한자, 한글같은 비 영어권 문자 2byte)까지 표현하기 부족해서 1byte를 추가할 할당해서 표현한 방식
 *      
 *     기본값
 *     char a = ' ',
 *     char a = '\u0000'
 */ 


public class CharEX {

	public static void main(String[] args) {

		char ch1 ='a';
		char ch2 ='c';
		char a = ' ';
	    char c = '\u0000';
		
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println(a);
		System.out.println(c);
		
		System.out.println("ch1 + ch2:"+ch1+ch2);
		System.out.println("ch1 + ch2:"+(ch1+ch2));


	}

}
