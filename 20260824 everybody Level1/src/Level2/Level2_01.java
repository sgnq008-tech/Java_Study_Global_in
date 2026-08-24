package Level2;

public class Level2_01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        // [전위 증가 (++a)]: 값을 먼저 1 증가시킨 후 x에 대입함
        // 1) a가 5 -> 6으로 증가
        // 2) 증가된 6이 x에 대입됨 (x = 6, a = 6)
        int x = ++a; 

        // [후위 증가 (b++)]: 현재 값을 먼저 y에 대입한 후 b를 1 증가시킴
        // 1) 현재 b의 값(5)이 y에 먼저 대입됨 (y = 5)
        // 2) 그 후 b가 5 -> 6으로 증가함 (b = 6)
        int y = b++; 

        // 현재 a는 6, b도 6인 상태이므로: 6 + 6 = 12
        int z = a + b;

        // 출력 결과: x=6, y=5, z=12
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
    }
}