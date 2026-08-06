
public class OperEX01 {

	public static void main(String[] args) {
		int i = 5;
		i++; // i = 6 -> i = i + 1와 동일하다.(증가연산자)
		// i++ => 먼저 대입하고, 후연산
		System.out.println(i);
		i = 5;
		++i;// 먼저 연산한 후에 대입 (전치연산)
		System.out.println(i);


	}

}
