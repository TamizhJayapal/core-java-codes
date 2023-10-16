/**
 * String: sequence of characters; immutable - once created 
 * never modify /String pool/ reference vs value
 * String Methods
 * 1.str.length
 * 2.str.concat
 * 3.str.substring
 * 4.str.toUpperCase
 * 5.str.indexOf
 * 6.str.replace
 * 7.str.split
 * 8.str.trim
 * 9.str.charAt
 * 10.str.equalsIgnoreCase
 * 11.str.contains
 * 12.str.startsWith
 * 13.str.endsWith
 * 14.str.toCharArray
 * 15.str.toLowerCase
 */

package com.example;

public class Main {

	public static void main(String[] args) {

		String str1 = new String("tamizh");
		String str2 = "tamizh ";
		String str3 = "";
		String str4 = null;
		
		//string pool 
		
		String str5 = "tamizh";
		
		//Same value same reference
		System.out.println(str2 == str5); // reference check true
		//value check
		System.out.println(str2.equals(str5));
		
		//Same value diff reference
		System.out.println(str1 == str2); // reference check false
		//value check
		System.out.println(str1.equals(str2));
		
		
		
		System.out.println(str2.length());
		System.out.println(str2.indexOf("i"));
		System.out.println(str2.charAt(2));
		System.out.println(str2.trim());
		System.out.println(str2.contains("mi"));
		System.out.println(str2.startsWith("T"));
		System.out.println(str2.endsWith("h"));
		System.out.println(str2.concat(str5));
		System.out.println(str2.substring(5));
		System.out.println(str2.toCharArray());
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.split(" "));
		System.out.println(str2.equalsIgnoreCase(str5));
		System.out.println(str2.toCharArray());
		System.out.println(str2.replace("t","y"));
		
	}

}
