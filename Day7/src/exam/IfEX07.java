package exam;
/*문
2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 
두점으로 표현한다. (100,100)과 (200,200)의 두 점으로 이루어진 
사각형이 있을떄 x, y값을 입력받고 점(x,y)가 이 직사각형 안에 있는지를 판별하는 프로그램을 구현하시오

결과

점(x,y)의 좌표 입력 : 150 150
(150,150)는 사각형 안에 있습니다.
*/

import java.util.*;
public class IfEX07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		  // 사용자에게 좌표 입력받기 
		  System.out.print("점(x,y)의 좌표 입력 : "); 
		  int x = sc.nextInt();
		  int y = sc.nextInt();
		  
		  // if ()점이 사각형 안에 있는 경우
		  
		  //else 없는 경우
		 // if문을 이용한 범위 판별 // x가 100과 200 사이이고, '동시에' y도 100과 200 사이인지 확인 
		  
		 
		  if ((x >=100 && x <= 200) || (y >= 100 && y <= 200)) { // 점이 사각형 안에 있는 경우
		  System.out.println("(" + x +"," + y + ")는 사각형 안에 있습니다."); } 
		  else { // 없는 경우
		System.out.println("(" + x + "," + y +")는 사각형 밖에 있습니다."); }
		 
		

	}

}
