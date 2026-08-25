package Level3;

class Member {
    String name;
    int age;
    String grade;

    public Member(String name) {
        // [정답 (C)] this(...) 생성자 호출:
        // 자기 자신의 다른 생성자를 호출하여 코드 중복을 제거함 (반드시 첫 줄에 작성)
        this(name, 20, "NORMAL"); // 기본 나이 20, 기본 등급 "NORMAL" 전달
    }

    // 2. 이름과 나이를 전달받는 생성자
    public Member(String name, int age) {
        
        this(name, age, "NORMAL"); // 기본 등급 "NORMAL" 전달
    }

    // 3. 모든 필드를 직접 초기화하는 마스터 생성자
    public Member(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    public static void main(String[] args) {
        // 1. 객체 생성
        Member m = new Member("홍길동");

        // 2. 참조 변수 m을 통해 필드에 접근하여 출력
        System.out.println(m.name + "의 나이는 " + m.age + "세이고 등급은 " + m.grade + "입니다.");
    }
    }