package Level3;

// [1번 문제] Custom 객체의 HashSet 중복 제거 (equals & hashCode 재정의)
import java.util.*;

// 상품 정보를 담는 클래스
class Product {
    String id;   // 상품 식별 ID (예: "P-001")
    String name; // 상품 이름 (예: "키보드")

    // 생성자: 객체 생성 시 ID와 이름을 받아서 초기화
    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // [1단계 검사] hashCode() 오버라이딩:
    // id가 같으면 항상 동일한 해시코드(사물함 번호 정수)를 반환하도록 설정
    @Override
    public int hashCode() {
        // id가 null이 아니면 id 문자열 고유의 hashCode를 반환, null이면 0 반환
        return id != null ? id.hashCode() : 0;
    }

    // [2단계 검사] equals() 오버라이딩:
    // 동일한 사물함(hashCode) 내에서 실제 id 문자열 값이 일치하는지 상세 비교
    @Override
    public boolean equals(Object obj) {
        // 비교 대상(obj)이 Product 타입의 객체인지 사전 확인
        if (obj instanceof Product) {
            Product other = (Product) obj; // 안전한 형변환(다운캐스팅)
            // 내 id와 상대방(other)의 id가 둘 다 null이 아니고, 값이 100% 일치하는지 비교
            return this.id != null && this.id.equals(other.id);
        }
        return false; // Product 타입이 아니면 무조건 다른 객체로 판단
    }

    // 객체를 출력할 때 [ID:이름] 형태로 깔끔하게 보이도록 재정의
    @Override
    public String toString() {
        return id + ":" + name;
    }
}

public class Test01 {

    // [수정 핵심] 프로그램의 실행 시작점인 main 메서드로 변경
    public static void main(String[] args) {
        // 중복을 허용하지 않는 HashSet 생성 (Product 객체 전용)
        Set<Product> set = new HashSet<>();

        // 1. 첫 번째 상품 추가 ("P-001", "키보드") -> 저장 성공
        set.add(new Product("P-001", "키보드"));

        // 2. 두 번째 상품 추가 ("P-001", "마우스")
        // -> id("P-001")가 같아서 hashCode()와 equals() 모두 일치 판정!
        // -> Set이 중복 데이터로 인식하여 저장을 무시함 (중복 제거)
        set.add(new Product("P-001", "마우스"));

        // 3. 출력 결과 확인: 중복이 제거되어 1개만 출력됨 [P-001:키보드]
        System.out.println("=== 1번 문제 출력 ===");
        System.out.println(set);
    }
}