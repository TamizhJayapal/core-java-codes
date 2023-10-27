/*Exception Handling
 * To avoid code break/execution stop
 * To intimate developer to fix or do some alternate program
 * To trace Stack / logging
 * 
 * keywords: try , catch , finally , throw, throws
 * 
 * types of exception
 * compile time , run time and custom exception
 * 
 * compileTime:
 * 
 * FileNotFound
 * ClassNotFound
 * IOException
 * NoSuchFeild
 * NoSuchMethod
 * IllegalArgumentException
 * 
 * runtime
 * 
 * ArrayIndexOutOfBounds
 * Arithmetic
 * NullPointer
 * NoSuchElement
 * NumberFormat
 * ClassCast
 * 
 */

package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class InsuffientFundException extends Exception {
	int amount;
	InsuffientFundException(int amount){
		amount = amount;
	}
}

class FileProcessor {
	public String readFile(String file) throws IOException, FileNotFoundException {
		FileReader obj = new FileReader(file);
		
		BufferedReader reader = new BufferedReader(obj);
		
		StringBuilder sb = new StringBuilder();
		
		String line;
		
		while((line = reader.readLine()) != null) {
			sb.append(line);
		}
		
		return sb.toString();
	}
}

public class ExceptionHandlingExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		int a = 10, b =5;
		int c = 0;
		int[] arr = null;
		try {
			if(b == 0) {
				throw new ArithmeticException("Denominator can't be zero");
			}
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
			System.out.println(e.getMessage());
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
		
		
		FileProcessor fp = new FileProcessor();
		String content = fp.readFile("input.txt");
		System.out.println(content);
		
		//System.out.println(c);
		System.out.println("program completed");
	}

}
