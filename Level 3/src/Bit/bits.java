package Bit;

/*📌 [문제 1] 연산자 (Level 3: 비트 연산자 & 복합 삼항 연산자)
목표: 단순 conditional 대신 중첩 삼항 연산자와 비트 연산 활용하기

요구사항:

int number = 18; 변수가 주어집니다.

이 숫자가 "짝수이면서 10 이상"이면 "A", "짝수이지만 10 미만"이면 "B", "홀수"이면 "C"를 반환하는 삼항 연산자 단 한 줄을 작성하세요.

짝수/홀수 판별 시 % 2 == 0 대신 비트 연산자(&)를 활용해 보세요. ((number & 1) == 0은 짝수)

예상 출력:

숫자: 18 -> 등급: A*/

public class bits {
	    public static void main(String[] args) {
	        int number = 18;

	        // (number & 1) == 0 은 짝수 판별
	        String result = ((number & 1) == 0) ? (number >= 10 ? "A" : "B") : "C";

	        System.out.println("숫자: " + number + " -> 등급: " + result);
	    }
	}

