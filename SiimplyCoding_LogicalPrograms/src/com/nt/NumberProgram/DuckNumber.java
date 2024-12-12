package com.nt.NumberProgram;


//Check if number is Duck number or not. A number which has zeroes present in  it 
// eg::  402, 280;


public class DuckNumber {

	public static void main(String[] args) {
		
		int number = 402;
		
		int temp = number;
		
		int count = 0;
		
		while(temp > 0) {
			
			int d = temp % 10;
			if(d==0)
			count++;
			
			temp = temp / 10;
		}
		System.out.println("Count zero::"+count);
		
		if(count > 0) {
			System.out.println("Duck Number");
		}else {
			System.out.println("Not Duck Number");
		}
	}
}
