package Level2;

public class Level2_02 {
    public static void main(String[] args) {
        // 문자열 리터럴로 생성 (상수 풀에 생성된 주소를 가리킴)
        String str1 = "Java";
        
        // new 연산자로 생성 (힙 메모리에 독립적인 새 객체 주소를 가리킴)
        String str2 = new String("Java");

        // 1. == 연산자: 참조(메모리 주소값)가 일치하는지 비교 -> 서로 다른 객체이므로 false
        boolean result1 = (str1 == str2);

        // 2. equals() 메서드: 객체 내부의 실제 문자열 내용이 같은지 비교 -> 둘 다 "Java"이므로 true
        boolean result2 = str1.equals(str2);

        // 출력 결과:
        // result1: false
        // result2: true
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
    }
}