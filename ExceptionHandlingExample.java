/*Exception Handling
 * To avoid code break/execution stop
 * To intimate developer to fix or do some alternate program
 * To trace Stack / logging
 * 
 * keywords: try , catch , finally , throw, throws
 * 
 * types of exception
 * compile time , run time and custom exception
 */

package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//custom exception
class InsuffientFundException extends Exception {
	int amount;
	InsuffientFundException(int amount){
		amount = amount;
	}
}

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int a = 10, b =5;
		int c = 0;
		int[] arr = null;
		try {
      //runtime exception
			//arithmetic
			//c = a/b;
			
			//null pointer / array index out
			//arr[1] = 5;
			
			int balance = 500;
			int withdraw = 1000;
			if(balance < withdraw) {
				throw new InsuffientFundException(withdraw - balance);
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmentic error accurred");
		}
		catch(NullPointerException e) {
			System.out.println("null pointer error accurred");
		}
		catch(InsuffientFundException e) {
			System.out.println("custom exception: insuffient fund");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("code must executed");
		}
		
		
		// compile time exception
		
		File file = new File("info.txt");
		
		try {
			FileInputStream inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(c);
		System.out.println("program completed");
	}

}
