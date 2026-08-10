package Class;

public class ArrayPractice {
    public static void main(String[] args) {
        // 1. 크기가 4인 배열 선언 및 생성
        int[] numbers = new int[4];

        // 2. 각 방에 값 대입하기
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        // 여기 아래에 numbers[1], numbers[2], numbers[3] 값 대입 작성

        // 3. 2번 방의 값(30) 출력하기
        System.out.println(numbers[2]);
    }
}