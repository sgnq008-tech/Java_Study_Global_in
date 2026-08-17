package quiz01;

/**
 * [실행 클래스 - 다형성(Polymorphism) 테스트]
 */
public class Main {
    public static void main(String[] args) {
        // 1. 구체 클래스 인스턴스 생성
        Television tv = new Television("삼성");
        AirPurifier purifier = new AirPurifier("LG");

        // 2. [다형성 1: 부모 추상 클래스 타입 배열]
        // 서로 다른 클래스(Television, AirPurifier)이지만 부모가 Appliance로 같으므로 한 배열에 관리 가능
        System.out.println("=== 가전제품 정보 확인 ===");
        Appliance[] appliances = { tv, purifier };
        for (Appliance app : appliances) {
            // 실행 시점에 실제 인스턴스의 오버라이딩된 showInfo()가 호출됨 (동적 바인딩)
            app.showInfo();
        }

        // 3. [다형성 2: 인터페이스 타입 배열]
        // RemoteControllable 규격을 만족하는 모든 객체를 모아서 일괄 전원 켜기 수행
        System.out.println("\n=== 리모컨으로 일괄 전원 켜기 ===");
        RemoteControllable[] remotes = { tv, purifier };
        for (RemoteControllable remote : remotes) {
            remote.powerOn();
        }

        // 4. TV 고유 기능(Soundable) 호출
        System.out.println("\n=== TV 볼륨 조절 ===");
        tv.soundUp();
        tv.soundDown();
    }
}