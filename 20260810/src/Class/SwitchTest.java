package Class;
public class SwitchTest {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
                default :
                System.out.println("주말 또는 잘못된 입력입니다");
            // 여기 아래에 case 2부터 작성해 보세요!
            
        }
    }
}