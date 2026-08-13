package ShortHotels;

public class Room {
    // 캡슐화: 필드를 private으로 선언
    private int roomNumber;
    private String guestName;
    private boolean isOccupied;

    public Room() {}

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.guestName = "";
        this.isOccupied = false;
    }

    // Getter
    public int getRoomNumber() { return roomNumber; }
    public boolean isOccupied() { return isOccupied; }
    public String getGuestName() { return guestName; }

    // 비즈니스 메서드
    public void checkIn(String guestName) {
        this.guestName = guestName;
        this.isOccupied = true;
        System.out.println("[" + roomNumber + "]호에 [" + guestName + "]님 입실 완료!");
    }

    public void checkout() {
        this.guestName = "";
        this.isOccupied = false;
        System.out.println("[" + roomNumber + "]호 퇴실 처리되었습니다.");
    }

    public void printInfo() {
        System.out.println("[" + roomNumber + "]호 - 상태: " + (isOccupied ? "투숙중(" + guestName + ")" : "빈 방"));
    }
}