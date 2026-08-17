package quiz02;

/**
 * [센서 데이터 수집 인터페이스]
 * - 역할: 센서 값을 측정하고 센서 종류를 반환하는 규약입니다.
 * - 분리 이유: 모든 IoT 기기가 센서를 탑재한 것은 아니므로 별도 분리(ISP 원칙)합니다.
 */
public interface Sensor {
    // 센서 측정값 반환 (예: 온도 24.5도)
    double readValue();
    
    // 센서 종류 이름 반환 (예: "온도", "습도")
    String getSensorType();
}