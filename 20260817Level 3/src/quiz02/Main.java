package quiz02;

/**
 * [실행 클래스 - 다형성, 인터페이스 필터링(instanceof) 테스트]
 */
public class Main {
    public static void main(String[] args) {
        // 1. 객체 생성
        SmartAirCon ac = new SmartAirCon("거실 에어컨");
        SmartCCTV cctv = new SmartCCTV("현관 CCTV");

        // 2. [다형성 활용] 부모 타입 SmartDevice 배열로 모든 기기 묶기
        SmartDevice[] devices = { ac, cctv };

        // 3. 기기 개별 작동 테스트
        System.out.println("=== 기기 전원 및 Wi-Fi 연결 ===");
        ac.turnOn();
        ac.connectWifi("Home_5G");

        cctv.turnOn();
        cctv.connectWifi("Home_5G");
        cctv.startRecording();

        // 4. [instanceof 활용]: 등록된 기기 중 센서 기능(SensorReadable)을 가진 기기만 선별
        System.out.println("\n=== 센서 장착 기기 모니터링 ===");
        for (SmartDevice device : devices) {
            if (device instanceof Sensor) {
                // 다운캐스팅: SmartDevice -> SensorReadable 인터페이스
                Sensor sensorDevice = (Sensor) device;
                System.out.printf("[%s] %s 측정값: %.1f도\n", 
                        device.getDeviceName(), sensorDevice.getSensorType(), sensorDevice.readValue());
            }
        }

        // 5. 일괄 전원 끄기
        System.out.println("\n=== 일괄 외출 모드 (모든 전원 OFF) ===");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}