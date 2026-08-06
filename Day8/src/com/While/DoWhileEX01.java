package com.While;

/*문]
	Do while 버젼 평균 구하기
*/
import java.util.*;
public class DoWhileEX01 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int kor, eng, mat, result = 0;
       float avg = 0.0f;
       
       do {
    	   System.out.println("국어점수 :");
    	   kor = sc.nextInt();   
       }while(kor < 0 || kor > 100);
       
       do {
    	   System.out.println("영어점수 :");
    	   eng = sc.nextInt();   
       }while(eng < 0 || eng > 100);
       
       do {
    	   System.out.println("수학점수 :");
    	   mat = sc.nextInt();   
       }while(mat < 0 || mat > 100);
       
       result = kor + eng + mat;
       
       avg = result / 3.0f;
       
       System.out.println("총점" + result);
       System.out.printf("평균 : %.2f", avg);
       
	}

}
