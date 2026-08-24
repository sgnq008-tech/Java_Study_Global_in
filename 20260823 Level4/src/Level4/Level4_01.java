package Level4;

import java.util.*;

// Comparable<Student> 인터페이스를 구현하여 객체의 기본 정렬 기준 정의
class Student implements Comparable<Student> {
    String name; // 학생 이름
    int score;   // 점수

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // [정답] compareTo 메서드 구현
    @Override
    public int compareTo(Student other) {
        // 1. 점수가 다른 경우: 점수 기준 내림차순(높은 점수 우선)
        // (상대방 점수 - 내 점수)가 양수이면 내가 뒤로 가므로 내림차순 정렬됨
        if (this.score != other.score) {
            return other.score - this.score;
        }
        
        // 2. 점수가 같은 경우: 이름(String) 기준 사전순 오름차순
        // String 클래스의 내장 compareTo를 호출하여 A->Z, 가->힣 순으로 정렬
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + "(" + score + ")";
    }
}

public class Level4_01 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Kim", 85));
        list.add(new Student("Lee", 95));
        list.add(new Student("Park", 85));

        // Collections.sort()는 객체 내에 구현된 compareTo 규칙에 맞춰 정렬을 수행함
        Collections.sort(list);
        
        // 출력 결과: [Lee(95), Kim(85), Park(85)]
        // Lee가 95점으로 1등, Kim과 Park은 85점 동점이라 이름 알파벳순(K -> P)으로 정렬됨
        System.out.println(list); 
    }
}