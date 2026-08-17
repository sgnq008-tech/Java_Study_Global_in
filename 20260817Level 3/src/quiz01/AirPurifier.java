package quiz01;

/**
 * [공기청정기 구체 클래스]
 * - Appliance(추상 클래스)를 상속(extends)받고,
 *   RemoteControllable(인터페이스)만 구현(implements)합니다. (Soundable은 불필요하므로 구현하지 않음)
 */
public class AirPurifier extends Appliance implements RemoteControllable {

    public AirPurifier(String brand) {
        // 부모 생성자 호출을 통한 brand 필드 초기화
        super(brand);
    }

    // --- Appliance 추상 클래스의 추상 메서드 오버라이딩 ---
    @Override
    public void showInfo() {
        System.out.println(brand + " 공기청정기입니다.");
    }

    // --- RemoteControllable 인터페이스 메서드 오버라이딩 ---
    @Override
    public void powerOn() {
        System.out.println(brand + " 공기청정기 작동 시작");
    }

    @Override
    public void powerOff() {
        System.out.println(brand + " 공기청정기 작동 중지");
    }
}