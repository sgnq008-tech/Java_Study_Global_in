<<<<<<< HEAD
package com.collectionex;

import java.util.*;
class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return name+" : "+age;
		
	}

}



public class HashSetEx02 {
	
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		System.out.println(set);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
=======
package com.collectionex;

import java.util.*;
class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return name+" : "+age;
		
	}

}



public class HashSetEx02 {
	
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		System.out.println(set);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
>>>>>>> 2fccac690dfcf427d52b9e91be42eb2ada05ab5b
