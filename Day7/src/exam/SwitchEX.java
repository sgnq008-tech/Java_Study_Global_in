package exam;

/*문]
	세 과목을 점수를 입력받아 총점과 평균을 구하고
	평균을 이용하여 학점을 판정하는 프로그램을 구현하시오
	
	단, switch ~ case 문을 활용하시오.
	
	학점은 평균이
	90 이상 A
	80 이상 B
	70 이상 C
	60 이상 D
	60 이하는 F
	*/

import java.util.*;
public class SwitchEX {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
    int kor, eng, mat, sum = 0;
    char grade;
    float avg = 0.0f;
    
    System.out.print("국어 점수 :");
    kor = sc.nextInt();
    System.out.print("영어 점수 :");
    eng = sc.nextInt();
    System.out.print("수학 점수 :");
    mat = sc.nextInt();
    
    // 합계
    sum = kor + eng + mat;
   
    // 평점(정수형으로 나오고, 3을 대신 3.0f을 추가해주면 소수점까지 계산한다
    avg = sum / 3;
    
    // 학점 판정
    switch ((int)(avg/10)) {
	case 9:
		grade ='A';
		break;
	case 8:
		grade ='B';
		break;
	case 7:
		grade ='C';
		break;
	case 6:
		grade ='D';
		break;
	default:
		grade = 'F';
	}
    
    System.out.printf("당신의 총점은 %d점이며," + "평균은 %.2f 학점은 %c입니다.", sum, avg, grade);
    
    
    
	}
	
	
	
	
	
	
	
	
	


}
