package Level4;

import java.util.*;

public class NewTest02 {
    public static void main(String[] args) {
        // 학생 데이터: [전공, 이름]
        String[][] students = {
            {"컴공", "김철수"},
            {"전자", "이영희"},
            {"컴공", "박민수"},
            {"컴공", "최유리"},
            {"전자", "정재석"}
        };

        // Key: 전공(String), Value: 해당 전공의 학생 이름 목록(List<String>)
        Map<String, List<String>> majorMap = new HashMap<>();

        for (String[] s : students) {
            String major = s[0]; // 전공
            String name = s[1];  // 이름

            // [정답 핵심 1] computeIfAbsent:
            // "해당 전공(Key)이 Map에 없으면 새 ArrayList를 만들어 넣고 반환해라"
            // (이미 존재하면 기존의 List를 반환함)
            majorMap.computeIfAbsent(major, k -> new ArrayList<>()).add(name);
        }

        // [정답 핵심 2] Map 순회 출력
        for (Map.Entry<String, List<String>> entry : majorMap.entrySet()) {
            System.out.println("[" + entry.getKey() + " 학과] " + entry.getValue());
        }
    }
}
