package Hotel;

public class Room {
    // 필드 (메인 클래스에서 직접 접근할 수 있도록 default 지정)
    int roomNumber;         // 방 번호
    String guestName;       // 투숙객 이름
    boolean isOccupied;     // 입실 여부 (true: 투숙중, false: 빈 방)

    // 기본 생성자
    public Room() {
    }

    // 방 번호를 받아 초기화하는 생성자
    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.guestName = " ";
        this.isOccupied = false;
    }

    // 입실 수속 메서드
    public void checkIn(String guestName) {
        this.guestName = guestName;
        this.isOccupied = true;
        System.out.println("[" + roomNumber + "]호에 [" + guestName + "]님 입실 완료!");
    }

    // 퇴실 수속 메서드 (HotelMain에서 checkout()으로 호출함)
    public void checkout() {
        this.guestName = " ";
        this.isOccupied = false;
        System.out.println("[" + roomNumber + "]호 퇴실 처리되었습니다.");
    }

    // 객실 상태 출력 메서드
    public void printInfo() {
        System.out.println("[" + roomNumber + "]호 - 상태:" + (isOccupied ? "투숙중(" + guestName + ")" : "빈 방"));
    }
}