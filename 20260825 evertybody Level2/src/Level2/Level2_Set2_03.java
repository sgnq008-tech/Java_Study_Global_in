package Level2;

import java.util.HashMap;
import java.util.Map;

public class Level2_Set2_03 {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        // 1. "국어": 80 추가
        scores.put("국어", 80);
        
        // 2. "영어": 90 추가
        scores.put("영어", 90);
        
        // 3. 동일한 Key "국어"로 다시 put 실행 -> 기존 80이 95로 덮어씌워짐
        scores.put("국어", 95); 

        // 출력: 국어 점수: 95
        System.out.println("국어 점수: " + scores.get("국어"));
        
        // 출력: 전체 과목 수: 2 (키는 "국어", "영어" 2개만 존재)
        System.out.println("전체 과목 수: " + scores.size());
    }
}