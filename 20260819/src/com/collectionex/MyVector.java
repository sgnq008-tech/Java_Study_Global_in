package com.collectionex;
import java.util.*;
public class MyVector extends Vector{

	public MyVector() {
		super(1, 1);
	}
	
	public void addInt(int i) {
		addElement(i);
	}
	public void addFloat(float f) {
		addElement(f);
	}
	public void addString(String s) {
		addElement(s);
	}
	public void addCharArray(char a[]) {
		addElement(a);
	}
	public void wrtie() {
		
		Object o;
		int length = size();
		System.out.println(length);
		
		for(int i = 0; i < length; i ++) {
			o = elementAt(i);
			if(o instanceof char[]) {
				System.out.println(String.copyValueOf((char[])o));
			}else
				System.out.println(o.toString());
		}
		
		
	}
}
