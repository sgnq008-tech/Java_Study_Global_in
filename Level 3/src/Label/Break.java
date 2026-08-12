package Label;

/*📌 [문제 2] 제어문 (Level 3: 중첩 루프 및 Label break)목표: 다중 루프에서 원하는 위치로 한 번에 탈출하는 라벨(Label) 
 * 제어문 익히기
 * 
 * 요구사항:2중 for문(구구단 2 x 1 ~ 9 x 9)을 작성하세요.
 * 단, 곱셈 결과(i * j)가 20 이상이 되는 순간, 안쪽 for문만 빠져나가는 것이 아니라 
 * 바깥쪽 for문까지 한 번에 완전히 탈출(Break Label)하도록 만드세요.
 * 
 예상 출력:
2 * 1 = 2
2 * 9 = 18
3 * 1 = 3
...
4 * 5 = 20
*/

// Break 클래스 선언
public class Break {


 public static void main(String[] args) {


     // 2단~9단 반복 (단수)
     for (int i = 2; i <= 9; i++) {

         // 1~9 반복 (곱하는 수)
         for (int j = 1; j <= 9; j++) {

             // 곱셈 결과 저장
             int result = i * j;

             // 결과가 20 이상인지 검사
             if (result >= 20) {

                 // 식 및 결과 출력
                 System.out.println(i + " * " + j + " = " + result);

                 // 종료 메시지 출력
                 System.out.println(">>> 곱셈 결과가 20 이상이 되어 전체 루프를 종료합니다.");

                break;
             }

             // 일반 곱셈 결과 출력
             System.out.println(i + " * " + j + " = " + result);
         }
     }
 }
}