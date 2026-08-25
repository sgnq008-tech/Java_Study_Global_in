package Level3;

import java.util.Arrays;

public class Array{
    public static void safeModify(int[] original) {
        
        // 힙 메모리에 완전히 새로운 독립된 배열 객체를 생성하여 내용을 복사함 (깊은 복사)
        int[] copy = Arrays.copyOf(original, original.length);

        // 복사본 배열의 0번째 값을 변경하더라도, 원본 original 배열에는 아무런 영향을 주지 않음
        copy[0] = 999; 
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        
        safeModify(arr); // 메서드 호출 시 복사본을 만들어 다루므로 안전함
        
        // 출력 결과: arr[0]: 1 (원본 데이터가 안전하게 유지됨)
        System.out.println("arr[0]: " + arr[0]);
    }
}