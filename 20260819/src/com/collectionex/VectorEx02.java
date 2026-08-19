package com.collectionex;

import java.util.*;


public class VectorEx02 {

	public static void main(String[] args) {
	
		MyVector v = new MyVector();
		
		int digit = 5;
		float real = 3.14f;
		char[]letters = {'j','a','v','a'};
		String s = new String("I HATE U");
		
		v.addInt(digit);
		v.addFloat(real);
		v.addCharArray(letters);
		v.addString(s);
		
		v.wrtie();
	}
	  

}
