package quiz02;

/**
 * [스마트 기기 최상위 추상 클래스]
 * - PowerControllable 인터페이스를 기본 구현(implements)하여 
 *   모든 기기가 전원 관리 공통 로직을 공유하도록 합니다.
 */
public abstract class SmartDevice implements PowerControl {
    
    // 기기 이름 (외부 변경 방지를 위해 private)
    private final String deviceName;
    
    // 전원 상태 (기본값: false = 꺼짐)
    private boolean powerStatus;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.powerStatus = false;
    }

    public String getDeviceName() {
        return deviceName;
    }

    // --- PowerControllable 인터페이스 공통 구현 ---
    @Override
    public void turnOn() {
        this.powerStatus = true;
        System.out.printf("[%s] 전원이 켜졌습니다.\n", deviceName);
    }

    @Override
    public void turnOff() {
        this.powerStatus = false;
        System.out.printf("[%s] 전원이 꺼졌습니다.\n", deviceName);
    }

    @Override
    public boolean isPowerOn() {
        return powerStatus;
    }
}