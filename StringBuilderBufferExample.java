/**
 * StringBuilder vs StringBuffer: sequence of characters with mutability;
 * String builder is not thread safe
 * String buffer is thread safe
 * String Methods
 * 1.str.toString
 * 2.str.length
 * 3.str.indexOf
 * 4.str.charAt
 * 5.str.capasity
 * 6.str.append
 * 7.str.substring
 * 8.str.chars
 * 9.str.equals
 * 10.str.delete
 * 11.str.insert
 * 12.str.replace
 * 13.str.reverse
 * 14.str.setCharAt
 * 15.str.lastIndexOF
 */

package com.example;

public class Main {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("tamizh");
		StringBuilder sb2 = new StringBuilder("test");
		
		System.out.println(sb.toString());
		System.out.println(sb.length());
		System.out.println(sb.indexOf("i"));
		System.out.println(sb.charAt(2));
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		System.out.println(sb.append("test"));
		System.out.println(sb.substring(5));
		
		System.out.println(sb.chars().sum());
		System.out.println(sb.chars().count());
		

		System.out.println(sb.equals(sb2));
		System.out.println(sb.delete(4, 7));
		System.out.println(sb.insert(0, "Hi"));
		System.out.println(sb.replace(0,6,"text"));
		System.out.println(sb.reverse());
		System.out.println(sb.lastIndexOf("h"));
		sb.setCharAt(5, 'X');
		System.out.println(sb.toString());
		
		
	}

}
