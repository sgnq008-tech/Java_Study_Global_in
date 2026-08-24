package Level1;

import java.util.HashSet;
import java.util.Set;

public class Level1_04 {
    public static void main(String[] args) {
        // 중복을 허용하지 않고 순서가 없는 HashSet 생성
        Set<String> set = new HashSet<>();

        // 1. "Java" 추가 (저장 성공)
        set.add("Java");
        
        // 2. "Python" 추가 (저장 성공)
        set.add("Python");
        
        // 3. "Java" 중복 추가 시도
        // -> Set은 동일한 데이터가 이미 존재하면 추가하지 않고 무시함 (중복 제거)
        set.add("Java");
        
        // 4. "C++" 추가 (저장 성공)
        set.add("C++");

        // [정답: 3]
        // 저장된 최종 요소는 ["Java", "Python", "C++"] 총 3개이므로 3이 출력됨
        System.out.println(set.size()); 
    }
}