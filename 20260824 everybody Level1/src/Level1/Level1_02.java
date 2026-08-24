package Level1;

public class Level1_02 {
    public static void main(String[] args) {
        // 5개의 정수가 들어있는 배열 생성
        int[] numbers = { 10, 20, 30, 40, 50 };
        // 누적 합계를 저장할 변수 초기화
        int sum = 0;

        // [정답 (B)] 향상된 for문 구조: for (타입 변수명 : 배열/컬렉션)
        // numbers 배열의 요소(10, 20, 30, 40, 50)를 하나씩 순서대로 num 변수에 담아 반복 실행
        for (int num : numbers) {
            // 꺼내온 숫자를 sum에 누적하여 더함 (sum = sum + num)
            sum += num;
        }

        // 출력 결과: 총합: 150 (10 + 20 + 30 + 40 + 50)
        System.out.println("총합: " + sum);
    }
}