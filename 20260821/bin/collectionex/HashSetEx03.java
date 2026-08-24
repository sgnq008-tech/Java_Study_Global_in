package com.collectionex;

import java.util.HashSet;

class Person2{
	String name;
	int age;
	
	public Person2(String name, int age) {
		
		this.age = age;
		this.name = name;
	
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return (name +age).hashCode();
	}
	
	@Override
	public String toString() {
		return name+" : "+ age;
	}
	
}
	

public class HashSetEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet set = new HashSet();
		
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person2("David",10));
		set.add(new Person2("David",10));
		System.out.println(set);
	}

}
