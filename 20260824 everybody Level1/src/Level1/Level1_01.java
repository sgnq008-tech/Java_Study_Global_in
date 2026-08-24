package Level1;

public class Level1_01 {
    public static void main(String[] args) {
        // 점수 변수 초기화
        int score = 75;
        
        // [정답 (A)] 삼항 연산자 구조: (조건식) ? 참일 때 반환값 : 거짓일 때 반환값
        // score가 60 이상이면 "합격", 미만이면 "불합격" 문자열을 반환하여 변수 result에 대입
        String result = score >= 60 ? "합격" : "불합격";
        
        // 출력 결과: 결과: 합격 (75점은 60점 이상이므로 참)
        System.out.println("결과: " + result);
    }
}