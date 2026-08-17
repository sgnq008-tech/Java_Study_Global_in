package quiz02;

/**
 * [스마트 CCTV 구체 클래스]
 * - SmartDevice 상속 + NetworkConnectable 구현 (센서 기능은 없음)
 */
public class SmartCCTV extends SmartDevice implements NetworkConnect {
    
    private boolean wifiConnected;

    public SmartCCTV(String deviceName) {
        super(deviceName);
        this.wifiConnected = false;
    }

    // --- NetworkConnectable 인터페이스 구현 ---
    @Override
    public void connectWifi(String ssid) {
        this.wifiConnected = true;
        System.out.printf("[%s] Wi-Fi(%s)에 연결되었습니다.\n", getDeviceName(), ssid);
    }

    @Override
    public void disconnectWifi() {
        this.wifiConnected = false;
        System.out.printf("[%s] Wi-Fi 연결을 해제했습니다.\n", getDeviceName());
    }

    /**
     * [CCTV 고유 동작]
     * - 전원이 켜져 있고(isPowerOn), Wi-Fi가 연결된 상태에서만 녹화 가능
     */
    public void startRecording() {
        if (isPowerOn() && wifiConnected) {
            System.out.printf("[%s] 녹화를 시작합니다.\n", getDeviceName());
        } else {
            System.out.printf("[%s] 녹화 실패 (전원 또는 네트워크 연결을 확인하세요).\n", getDeviceName());
        }
    }
}