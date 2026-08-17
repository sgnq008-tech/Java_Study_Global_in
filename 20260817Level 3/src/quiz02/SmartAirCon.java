package quiz02;

/**
 * [스마트 에어컨 구체 클래스]
 * - SmartDevice 상속 (전원 기능 내장)
 * - NetworkConnectable, SensorReadable 2개 인터페이스 다중 구현
 */
public class SmartAirCon extends SmartDevice implements NetworkConnect, Sensor {
    
    // 현재 접속된 Wi-Fi 이름 저장
    private String wifiSSID;

    public SmartAirCon(String deviceName) {
        // 부모 생성자 호출을 통해 기기 이름 초기화
        super(deviceName);
    }

    // --- NetworkConnectable 인터페이스 구현 ---
    @Override
    public void connectWifi(String ssid) {
        this.wifiSSID = ssid;
        System.out.printf("[%s] Wi-Fi(%s)에 연결되었습니다.\n", getDeviceName(), ssid);
    }

    @Override
    public void disconnectWifi() {
        System.out.printf("[%s] Wi-Fi(%s) 연결을 해제했습니다.\n", getDeviceName(), wifiSSID);
        this.wifiSSID = null;
    }

    // --- SensorReadable 인터페이스 구현 ---
    @Override
    public double readValue() {
        // 실제 기기에서는 온습도 센서 측정값이 들어가는 위치
        return 24.5;
    }

    @Override
    public String getSensorType() {
        return "실내 온도";
    }
}