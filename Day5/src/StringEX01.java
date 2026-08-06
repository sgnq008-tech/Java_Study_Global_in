
public class StringEX01 {
// 문자열의 비교 => equals("비교 하고자 하는 문자열")
// 숫자값을 비교할떄는 비교 연산자 (==)을 사용함
	
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\", ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
      // 다른 이유? -> 내용은 같지만 서로 다른 객체로 인식하기떄문이다.
		
	    System.out.printf("str1.equals(\"abc\") ? %b%n",str1.equals("abc"));
	    System.out.printf("str2.equals(\"abc\") ? %b%n",str2.equals("abc"));
	    System.out.printf("str2.equalsIgnoreCase(\"abc\") ? %b%n",
	    		str2.equalsIgnoreCase("ABC"));
	    //equalsIgnoreCase는 예를들면 대소문자 소문자를 구분하지 않고, 해당값이 동일하면 결과값이 출력되는 것  




	}

}
