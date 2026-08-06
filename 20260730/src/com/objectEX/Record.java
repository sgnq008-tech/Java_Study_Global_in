package com.objectEX;
/*
 * 속성만 존재하는 클래스
 *   속성의 또 다른 말은 -> 멤버필드, 변수
 *   
 *   속성명 : 이름, 국어, 영어, 수학, 총점, 평균, 석차
 * 
 */
public class Record {
	
	String name;
	int[] score = new int[3]; // 국어, 영어, 수학 과목 3개를 의미함
	// score[0] => 국어; score[1] => 영어; score[2] => 수학;
	
	int tot;
	
	double avg;
	int rank;
	
}
