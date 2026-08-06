package com.ifexam;
/*
 * 중첩 if
 *  - if 문안에 if문을 포함하고 있는 문장을 의미함
 *  
 *  형식
 *  if(조건이 참){ 
 *       조건이 참일떄 안쪽 if문 수행
 *     if( 조건식 ){
 *        조건이 참일떄
 *     }else{
 *        조건이 거짓일때
 *     }
 *  }else {
 *      거짓일떄
 *  }
 */

 /* 문]
  *  점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격
  *  단. 학년이 4학년일 경우 70점 이상여야 합격을 한다.
  */
import java.util.*;
public class IfEX04 {

	public static void main(String[] args) {
		
		// 학년과 점수를 입력받는다.
	   Scanner sc = new Scanner(System.in);
	   int score, year;
	   System.out.println("점수 :");
	   score= sc.nextInt();
	   System.out.println("학년 :");
	   year= sc.nextInt();
	   
	   if(score >=60) {// 점수가 60점 이상인 사람만 판정한다.
		   if(year != 4) {
		   System.out.println("합격");
		   }else if(score >=70) {// 4학년이면서 점수가 70점 이상인 사람이면 합격
			System.out.println("합격");
		   }else {// 4학년이면서 70점 이하면 불합격
			System.out.println("불합격");   
		   }
	   }else {
		   System.out.println("불합격");
	   }

}}
