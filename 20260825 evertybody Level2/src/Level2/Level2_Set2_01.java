package Level2;

public class Level2_Set2_01 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // [단락 평가 발생]
        // 1. (x > 15) -> 10 > 15 는 false
        // 2. AND(&&)는 하나만 false여도 전체가 false이므로 우측 (++x < y)를 실행하지 않음
        boolean result = (x > 15) && (++x < y);

        // 출력 결과: result=false, x=10 (++x가 실행되지 않아 x는 그대로 10)
        System.out.println("result=" + result + ", x=" + x);
    }
}