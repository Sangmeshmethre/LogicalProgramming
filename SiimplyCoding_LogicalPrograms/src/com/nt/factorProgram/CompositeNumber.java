package com.nt.factorProgram;


//Find if a no.is composite no. 
///==> Its is a no which has more than one factor(excl.1,n).eg::8=2,4=2 factors


public class CompositeNumber {

	public static void main(String[] args) {
		
		int number = 8;
		
		int count =0;
		
		for(int i=1; i<=number; i++) {
			
			if(number % i==0) {
				count++;
			}
		}
		
		if(count>3) {
			System.out.println("yes");
		}else {
			System.out.println("no ");
		}
	}
}
