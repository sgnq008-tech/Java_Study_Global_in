package Level1;

import java.util.ArrayList;

public class Level1_03 {
    public static void main(String[] args) {
        // 문자열을 순서대로 저장할 수 있는 ArrayList 객체 생성
        ArrayList<String> list = new ArrayList<>();

        // [정답 (C)] add(값): 리스트의 맨 끝에 새로운 데이터를 추가하는 메서드
        list.add("사과");   // 0번 인덱스에 저장
        list.add("바나나"); // 1번 인덱스에 저장

        // [정답 (D)] get(인덱스번호): 해당 인덱스(순서 번호)에 위치한 데이터를 읽어오는 메서드
        // 인덱스는 0부터 시작하므로 0번째 요소인 "사과"를 꺼내옴
        String fruit = list.get(0);

        // 출력 결과: 첫 번째 과일: 사과
        System.out.println("첫 번째 과일: " + fruit);
    }
}