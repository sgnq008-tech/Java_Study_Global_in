package Level4;

import java.util.*;

public class Level4_02 {
    public static void main(String[] args) {
        String[] words = { "apple", "banana", "apple", "orange", "banana", "apple" };
        Map<String, Integer> map = new HashMap<>();

        // 1. 단어별 빈도수 계산
        for (String w : words) {
            // [정답 (A)] getOrDefault(키, 기본값):
            // 맵에 단어(w)가 이미 있으면 저장된 개수를 가져오고, 처음 등장한 단어면 0을 가져온 뒤 +1을 더해 저장
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        // 2. Map에 저장된 전체 키-값(Key-Value) 쌍을 순회하며 출력
        // [정답 (B)] entrySet():
        // Map 내부의 Key와 Value를 묶은 Entry 객체들의 Set을 반환하여 for-each문에서 바로 사용 가능하게 함
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // getKey(): 단어 이름, getValue(): 등장 횟수
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}