package Level4;

import java.util.*;

class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + "세)";
    }
}

public class NewTest01 {
    public static void main(String[] args) {
        // [정답] Comparator를 구현하여 TreeSet의 정렬 규칙을 생성자로 전달
        // 1. 나이(age) 오름차순 (작은 나이 -> 큰 나이)
        // 2. 나이가 같으면 이름(name) 사전순 오름차순
        TreeSet<Employee> set = new TreeSet<>((e1, e2) -> {
            if (e1.age != e2.age) {
                // (내 나이 - 상대방 나이)가 음수면 앞으로 오므로 오름차순 정렬됨
                return e1.age - e2.age; 
            }
            // 나이가 같으면 String 클래스의 compareTo로 이름 비교
            return e1.name.compareTo(e2.name);
        });

        // 데이터 추가 (TreeSet은 add() 순간에 Comparator 규칙대로 자동 정렬됨)
        set.add(new Employee("홍길동", 28));
        set.add(new Employee("이순신", 45));
        set.add(new Employee("강감찬", 28));

        // 출력 결과: [강감찬(28세), 홍길동(28세), 이순신(45세)]
        // -> 28세 동갑 중에서 이름 가나다순(강감찬 -> 홍길동) 정렬 후 45세 이순신 배치
        System.out.println(set);
    }
}