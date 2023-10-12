package com.calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Select option: ");
			System.out.println("1.Addition");
			System.out.println("2.SubStraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			
			int option = scanner.nextInt();
			
			System.out.println("Enter number 1: ");
			int num1 = scanner.nextInt();
			System.out.println("Enter number 2: ");
			int num2 = scanner.nextInt();
			
			switch(option) {
			case 1:
				Calculate.addition(num1, num2);
				break;
			case 2:
				Calculate.substraction(num1, num2);
				break;
			case 3:
				Calculate.multiplication(num1, num2);
				break;
			case 4:
				Calculate.divition(num1, num2);
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
