package com.example;

import java.util.*;

class Student {
	private int id;
	
	private String name;
	
	private int age;
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

class AgeComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getAge() - o2.getAge();
	}
}

class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}



public class ComparatorExample {
	//using method reference
	//Comparator<Student> byName = Comparator.comparing(Student::getName);

	public static void main(String[] args) {
		List<Student> myObjects = new ArrayList<>();
		myObjects.add(new Student(2, "ram",35));
		myObjects.add(new Student(1, "tamizh",25));
		myObjects.add(new Student(3, "ashok",33));
		myObjects.add(new Student(4, "ashok",22));
		
		Comparator<Student> nameComparator = new NameComparator();
		Comparator<Student> ageComparator = new AgeComparator();
		Comparator<Student> finalComparator = nameComparator.thenComparing(ageComparator);
		
		Collections.sort(myObjects, finalComparator);
		
		for (Student obj : myObjects) {
			System.out.println(obj);
		}
	}
}
