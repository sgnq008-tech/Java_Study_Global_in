package exam;

/*문]
	원의 중심을 나타내는 한점과 반지름을 입력받는다.
	두 개의 원을 입력받고 두 원이 서로 겹치는지를 판별하는 프로그램을 구현하시오.  
	
	결과 
	
   첫번쨰 원의 중심과 반지름 : 10 10 3
   두번쨰 원의 중심과 반지름 : 12 12 2
   두 원은 서로 겹친다.
*/
import java.util.*;	
public class IfEX10 {


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("첫번쨰 원의 중심과 반지름 :");
	double x1 = sc.nextDouble();
	double y1 = sc.nextDouble();
	double r1 = sc.nextDouble();
	
	System.out.println("두번쨰 원의 중심과 반지름 :");
	double x2 = sc.nextDouble();
	double y2 = sc.nextDouble();
	double r2 = sc.nextDouble();
	
	double distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	double rsum = r1 + r2;
	
	if(distance < rsum) {
		System.out.println("두 원은 서로 겹친다.");
	}else
		System.out.println("두 원은 서로 겹치지 않는다.");
}}
