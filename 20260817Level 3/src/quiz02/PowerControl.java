package quiz02;

/**
 * [전원 제어 인터페이스]
 * - 역할: 전원을 켜고 끄며 상태를 확인하는 표준 규격을 정의합니다.
 */
public interface PowerControl{
    // 전원 켜기
    void turnOn();
    
    // 전원 끄기
    void turnOff();
    
    // 현재 전원 상태 확인 (true: 켜짐, false: 꺼짐)
    boolean isPowerOn();
}