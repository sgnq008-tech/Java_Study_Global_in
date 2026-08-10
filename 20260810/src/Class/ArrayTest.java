	package Class;
	
	public class ArrayTest {
	    public static void main(String[] args) {
	        // 1. 크기가 3인 배열 선언 및 생성
	        int[] scores = new int[3];

	     // 2. 각 방번호(인덱스)에 값 저장하기
	        scores[0] = 80; // 0번 방에 80 저장
	        scores[1] = 90; // 1번 방에 90 저장
	        scores[2] = 100; // 2번 방에 100 저장
	
	        // 3. 1번째 칸의 값(90) 출력하기
	        System.out.println(scores[1]);
	    }
	}