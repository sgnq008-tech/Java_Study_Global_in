package Level4;

import java.util.*;

public class Level4_Test02 {
    // [정답 (C) ? extends T, (D) ? super T]
    // PECS 공식 (Producer-Extends, Consumer-Super):
    // - 데이터를 제공/읽기만 하는 컬렉션(src)에는 상한 제한 와일드카드(? extends T)를 지정하여 안전한 읽기 보장
    // - 데이터를 전달받아 저장/소비하는 컬렉션(dest)에는 하한 제한 와일드카드(? super T)를 지정하여 안전한 쓰기 보장
    public static <T> void copyList(List<? extends T> src, List<? super T> dest) {
        for (T item : src) {
            // src에서 꺼낸 T 타입 객체를 dest에 안전하게 추가
            dest.add(item);
        }
    }

    public static void main(String[] args) {
        // Integer 리스트 (생산자 역할)
        List<Integer> intList = Arrays.asList(1, 2, 3);
        // Number(Integer의 부모) 리스트 (소비자 역할)
        List<Number> numList = new ArrayList<>();

        // copyList의 제네릭 T는 Integer로 추론되며, dest는 List<? super Integer>이므로 List<Number> 대입 가능
        copyList(intList, numList); 
        

        System.out.println(numList); 
    }
}