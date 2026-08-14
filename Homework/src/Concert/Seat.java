package Concert;

// 단일 좌석 정보를 관리하는 클래스
public class Seat {
    private String name; // 예약자 이름 (null이면 빈 좌석)

    // 생성자: 처음 생성될 때는 아무도 안 앉아있으므로 null로 초기화
    public Seat() {
        this.name = null;
    }

    // 좌석 예약: 입력받은 이름을 저장
    public void reserve(String name) {
        this.name = name;
    }

    // 좌석 취소: 이름을 지워서 빈 상태(null)로 변경
    public void cancel() {
        this.name = null;
    }

    // 좌석이 예약되어 있는지 판단 (이름이 있으면 true)
    public boolean isOccupied() {
        return name != null;
    }

    // 입력받은 이름과 해당 좌석의 예약자 이름이 일치하는지 비교
    public boolean match(String name) {
        return isOccupied() && this.name.equals(name);
    }

    // 현재 좌석의 예약자 이름을 반환
    public String getName() {
        return name;
    }
}