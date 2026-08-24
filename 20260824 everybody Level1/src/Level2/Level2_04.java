package Level2;

import java.util.*;

public class Level2_04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("elephant");
        list.add("dog");
        list.add("tiger");

        // List 요소를 순회하기 위한 Iterator(반복자) 객체 얻기
        Iterator<String> it = list.iterator();

        // [정답 (B)] hasNext(): 다음에 읽어올 요소가 남아있으면 true, 없으면 false 반환
        while (it.hasNext()) {
            // next(): 다음 요소를 꺼내오고 커서를 1칸 전진시킴
            String word = it.next();
            
            // 글자 수가 4글자 이상인 단어 조건 ("elephant", "tiger")
            if (word.length() >= 4) {
                // [정답 (C)] remove(): 방금 next()로 가리킨 요소를 컬렉션에서 안전하게 삭제
                // (일반 for문이나 for-each문에서 list.remove()를 쓰면 ConcurrentModificationException 발생 위험이 있음)
                it.remove();
            }
        }

        // 출력 결과: [cat, dog] (4글자 이상인 elephant, tiger가 삭제됨)
        System.out.println(list); 
    }
}