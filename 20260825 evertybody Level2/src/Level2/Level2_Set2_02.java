package Level2;

class Calculator {
    // 두 정수를 더하는 메서드
    public int add(int a, int b) {
        return a + b;
    }

    // [정답 (A)] 메서드 오버로딩: 메서드 이름은 같고 매개변수의 개수나 타입을 다르게 정의함
    public int add(int a, int b, int c) {
        return a + b + c; // 또는 return add(a, b) + c;
    }
}

public class Level2_Set2_02 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        
        // 매개변수 2개인 add 호출 -> 출력: 30
        System.out.println(cal.add(10, 20));     
        
        // 매개변수 3개인 add 호출 -> 출력: 60
        System.out.println(cal.add(10, 20, 30)); 
    }
}