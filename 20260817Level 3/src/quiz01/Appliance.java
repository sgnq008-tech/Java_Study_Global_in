package quiz01;

/**
 * [가전제품 최상위 추상 클래스]
 * - 역할: 모든 가전제품이 공통으로 가져야 할 속성(브랜드)과 공통 규약을 정의합니다.
 * - abstract 키워드: 직접 new Appliance()로 객체를 생성할 수 없으며, 반드시 자식 클래스가 상속받아야 합니다.
 */
public abstract class Appliance {
    
    // protected: 같은 패키지(quiz01) 및 이를 상속받은 자식 클래스에서 직접 접근을 허용
    protected String brand;

    // 부모 생성자: 자식 객체 생성 시 반드시 브랜드명을 넘겨받아 초기화하도록 강제
    public Appliance(String brand) {
        this.brand = brand;
    }

    /**
     * [추상 메서드]
     * - 구현부({})가 없으며, 자식 클래스에서 반드시 @Override(재정의)해야 컴파일 에러가 발생하지 않습니다.
     * - 기기마다 자기 소개 방식이 다르므로 자식 클래스에 구현 책임을 위임합니다.
     */
    public abstract void showInfo();
}