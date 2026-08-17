package quiz02;

/**
 * [네트워크 연결 인터페이스]
 * - 역할: Wi-Fi 접속 및 연결 해제 동작을 규정합니다.
 */
public interface NetworkConnect {
    // 특정 Wi-Fi 망(SSID)에 연결
    void connectWifi(String ssid);
    
    // Wi-Fi 연결 해제
    void disconnectWifi();
}