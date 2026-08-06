package exam;

/*문]
	2차원 평면에서 직사각형을 나타내는 두점 x,y가 있다.
	직사각형을 구성하는 두점(x1, y1), (x2,y2)를 입력받아 
	(100,100), (200,200)의 두 점으로 이루어진 
	직사격형과 충돌하는지를 판별하는 프로그램을 작성하시오.
	
	아래의 메소드(함수)를 활용하시오
	public static boolean inRect(int x, int y, int rectx1, int recty1, 
	            int rectx2, int recty2) { 
	if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)) {
	else
	            
	            }
*/

import java.util.*;

public class IfEX08 {

public static boolean inRect(int x, int y, int rectx1, int recty1, 
            int rectx2, int recty2) {
if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
	return true;
 else 
    return false;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        
        // 사용자로부터 입력받을 새로운 직사각형의 두 점 좌표
        System.out.print("첫 번째 점 (x1 y1) 입력: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        if (inRect(x1, y1, 100,  100, 200, 200) || 
        	inRect(x2, y2, 100,  100, 200, 200) || 
        	inRect(x1, y2, 100,  100, 200, 200) ||
        	inRect(x2, y1, 100,  100, 200, 200)) { // 한 꼭짓점이라도 사각형안에 포함되는 경우
        	System.out.println("사각형이 겹쳐 있습니다.");
         }else if (inRect(x1, y1, 100,  100, 200, 200) && 
            	inRect(x2, y2, 100,  100, 200, 200) && 
                inRect(x1, y2, 100,  100, 200, 200) &&
                inRect(x2, y1, 100,  100, 200, 200)) {
            System.out.println("사각형이 겹쳐 있습니다.");
         }else if (inRect(100,  100, x1, y1, x2, y2) &&
                		inRect(100,  100, x1, y1, x2, y2) &&
                		inRect(100,  100, x1, y1, x2, y2) &&
                		inRect(100,  100, x1, y1, x2, y2)) {
             System.out.println("사각형이 겹쳐 있습니다.");
         }else
            System.out.println("사각형이 겹쳐 있지 않습니다."); 
      //(100,100),(200,200) 사각형의 모든 꼭지점이 사용자가 정의 사각형 안에 있는 경우
}
}
 
            


