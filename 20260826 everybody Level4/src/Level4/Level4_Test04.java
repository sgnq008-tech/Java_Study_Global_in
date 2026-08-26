package Level4;


// 함수형 인터페이스 선언: 인터페이스 내부에 오직 1개의 추상 메서드만 존재하도록 컴파일러가 강제 검증함
@FunctionalInterface
interface ThrowingFunction<T, R> {
    // 체크 예외(throws Exception)를 던질 수 있도록 설계된 함수형 추상 메서드
    R apply(T t) throws Exception;
}

public class Level4_Test04 {
    // 람다식 실행 도중 발생하는 Checked Exception을 try-catch로 감싸서 안전하게 처리하는 유틸리티 메서드
    public static <T, R> R processSafely(T input, ThrowingFunction<T, R> func) {
        try {
            
            // 전달받은 함수형 인터페이스 객체의 추상 메서드 apply를 실행
            return func.apply(input);
        } catch (Exception e) {
            // 예외가 발생하면 콘솔에 에러 메시지를 출력하고 null을 반환하여 안전하게 프로그램 지속
            System.out.println("예외 처리: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        // 1. 정상 문자열 파싱 -> 성공
        Integer result1 = processSafely("123", str -> Integer.parseInt(str));
        
        // 2. 숫자가 아닌 문자열 파싱 -> NumberFormatException 발생하지만 catch로 잡아서 안전 처리
        Integer result2 = processSafely("abc", str -> Integer.parseInt(str));

       
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
    }
}