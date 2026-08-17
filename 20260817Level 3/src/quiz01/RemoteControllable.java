package quiz01;
/**
 * [전원 제어 인터페이스]
 * - 역할: 전원을 켜고 끄는 표준 규격을 정의합니다.
 * - 특징: 인터페이스의 모든 추상 메서드는 컴파일 시 자동으로 'public abstract'가 붙습니다.
 */
public interface RemoteControllable {
    
    // 기기의 전원을 켜는 동작을 강제
    void powerOn();
    
    // 기기의 전원을 끄는 동작을 강제
    void powerOff();
}