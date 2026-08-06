package exam;

/*문]
	원의 중심을 나타내는 한점과 반지름을 실수값으로 입력받아
	입력받은 실수 값으로 다른(x,y)를 입력받아 이 점이 원의
	내부에 있는지를 판별하는 프로그램을 구현하시오.
	
	힌트
	
	중심에서 (x,y)사이의 거리가 반지름보다 작거나 같으면 원의 내부에 있음
	변수x에 대한 제곱근의 값은 Math.squrt(x)를 이용한다.
	
	원의 중심과 반지름 입력 : 10 10 6.5
	점 입력 : 13,13
	점 (13.0, 13.0)은 원 안에 있다.
*/

import java.util.*;
public class IfEX09 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("원의 중심과 반지름 입력 :");
	double x = sc.nextDouble();
	double y = sc.nextDouble();
	double r = sc.nextDouble();
		
	System.out.println("점 입력 :");
	double x2 = sc.nextDouble();
	double y2 = sc.nextDouble();
	
	double distance = Math.sqrt((x-x2)*(x-x2)+(y-y2)*(y-y2));
		
	if(distance < r) {
		System.out.println("점("+x2+"," +y2+")는 원 안에 있습니다.");
	} else {
	System.out.println("점("+x2+"," +y2+")는 원 밖에 있습니다.");
	}
	}}
