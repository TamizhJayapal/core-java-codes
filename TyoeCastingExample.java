/*
 * Type Casting
 * 
 * To convert one type to another data type
 * 
 * primitive casting
 * 
 * implicit
 * explicit
 * 
 * Reference casting
 * 
 * UpCast
 * DownCast
 */

package com.example;

class Animal {
	
}

class Dog extends Animal {
	
}

public class TypeCastingExample {
	public static void main(String[] args) {
		//implicit
		int a = 12;
		double b = a;
		
		//explicit
		int c = (int) a;
		
		
		//upcast
		
		Animal dog = new Dog();
		
		//downcast
		
		Dog dog1 = (Dog) dog;
		
	}
}
