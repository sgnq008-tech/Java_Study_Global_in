package Level3;

// [클래스 레벨 final] 상속을 금지하여 하위 클래스에서 데이터를 변조하는 것을 방지
public final class ImmutablePerson {

    // [필드 레벨 private final]
    // - private: 외부에서 필드에 직접 접근하지 못하도록 은닉
    // - final: 객체 생성 시 최초 1회만 값이 대입되고 이후 수정 불가
    private final String name;
    private final int age;

    // 생성자: 객체 생성 시 초기화할 값을 주입받음
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter 메서드: 필드 값을 안전하게 조회만 가능하도록 제공 (Setter 없음)
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // 객체 자체를 출력할 때 원하는 문자열 형태로 변환되도록 재정의
    @Override
    public String toString() {
        return "이름: " + name + ", 나이: " + age + "세";
    }

    // 실행을 위한 main 메서드
    public static void main(String[] args) {
        // 1. 불변 객체 생성
        ImmutablePerson person = new ImmutablePerson("홍길동", 25);

        // 2. Getter를 활용한 개별 필드 출력
        System.out.println("--- Getter를 통한 출력 ---");
        System.out.println("이름: " + person.getName());
        System.out.println("나이: " + person.getAge() + "세");

        // 3. toString()을 통한 객체 정보 일괄 출력
        System.out.println("\n--- toString()을 통한 출력 ---");
        System.out.println(person);
    }
}