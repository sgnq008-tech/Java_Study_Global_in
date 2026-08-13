package ShortHotels;

public class HotelManager {
    private Room[][] rooms;

    // 생성자에서 방 배열을 바로 초기화
    public HotelManager(int floors, int roomsPerFloor) {
        rooms = new Room[floors][roomsPerFloor];
        for (int i = 0; i < floors; i++) {
            for (int j = 0; j < roomsPerFloor; j++) {
                rooms[i][j] = new Room((i + 1) * 100 + (j + 1));
            }
        }
    }

    // 1. 전체 객실 현황 출력
    public void printAllRooms() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j].printInfo();
            }
        }
    }

    // 2. 만실 체크 (빈 방 개수 계산)
    public boolean isFull() {
        int emptyCount = 0;
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (!rooms[i][j].isOccupied()) emptyCount++;
            }
        }
        return emptyCount == 0;
    }

    // 3. [핵심] 방 번호로 Room 객체를 찾아주는 내부 보조 메서드 (캡슐화)
    private Room findRoom(int targetRoom) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j].getRoomNumber() == targetRoom) {
                    return rooms[i][j];
                }
            }
        }
        return null; // 못 찾으면 null
    }

    // 4. 입실 수속 전담 메서드
    public void processCheckIn(int targetRoom, String name) {
        Room room = findRoom(targetRoom);
        if (room == null) System.out.println("존재하지 않는 방 번호입니다.");
        else if (room.isOccupied()) System.out.println("이미 예약된 방입니다.");
        else room.checkIn(name);
    }

    // 5. 퇴실 수속 전담 메서드
    public void processCheckOut(int targetRoom) {
        Room room = findRoom(targetRoom);
        if (room == null) System.out.println("존재하지 않는 방입니다.");
        else if (!room.isOccupied()) System.out.println("현재 빈 방입니다. 퇴실할 손님이 없습니다.");
        else room.checkout();
    }
}