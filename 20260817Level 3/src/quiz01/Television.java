package quiz01;

/**
 * [TV 구체 클래스]
 * - Appliance(추상 클래스)를 단일 상속(extends)받고,
 *   RemoteControllable, Soundable(인터페이스) 2개를 다중 구현(implements)합니다.
 */
public class Television extends Appliance implements RemoteControllable, Soundable {
    
    // 캡슐화: 외부에서 볼륨 값을 직접 조작하지 못하도록 private으로 은닉
    private int volume = 10;

    public Television(String brand) {
        // super(brand): 부모 추상 클래스(Appliance)의 생성자를 명시적으로 호출하여 brand 필드를 초기화
        super(brand);
    }

    // --- Appliance 추상 클래스의 추상 메서드 오버라이딩 ---
    @Override
    public void showInfo() {
        System.out.println(brand + " TV입니다.");
    }

    // --- RemoteControllable 인터페이스 메서드 오버라이딩 ---
    @Override
    public void powerOn() {
        System.out.println(brand + " TV 전원이 켜졌습니다.");
    }

    @Override
    public void powerOff() {
        System.out.println(brand + " TV 전원이 꺼졌습니다.");
    }

    // --- Soundable 인터페이스 메서드 오버라이딩 ---
    @Override
    public void soundUp() {
        volume++; // 내부 필드 상태 변경
        System.out.println("현재 볼륨: " + volume);
    }

    @Override
    public void soundDown() {
        volume--; // 내부 필드 상태 변경
        System.out.println("현재 볼륨: " + volume);
    }
}