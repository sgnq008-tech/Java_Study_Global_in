package com.collectionex;
import java.util.*;
public class VectorEx04 {

	public static void main(String[] args) {
		Vector<MyData> v = new Vector<MyData>();
		v.add(new MyData("신유", 24));
		v.add(new MyData("도훈", 22));
		v.add(new MyData("영재", 22));
		v.add(new MyData("한진", 21));
		v.add(new MyData("지훈", 21));
		v.add(new MyData("경민", 20));

		
		for(MyData my : v) {
			System.out.printf("이름 : %s , 나이 : %d\n",my.name,my.age);
		}
		
		
		
	}

}
