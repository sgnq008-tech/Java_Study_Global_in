package quiz01;

/**
 * [소리 조절 인터페이스]
 * - 역할: 볼륨을 올리고 내리는 표준 규격을 정의합니다.
 * - 분리 이유(ISP 원칙): 공기청정기처럼 소리 조절이 필요 없는 기기에는 이 인터페이스를 구현하지 않도록 분리합니다.
 */
public interface Soundable {
    
    // 볼륨을 1 올리는 동작 강제
    void soundUp();
    
    // 볼륨을 1 내리는 동작 강제
    void soundDown();
}