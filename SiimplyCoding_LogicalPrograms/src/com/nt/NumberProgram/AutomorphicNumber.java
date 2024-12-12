package com.nt.NumberProgram;


//Check if a number is Automorphic Number or not. it is a number which is contained in the 
// Last digit(s) of its square eg:25 in 625


public class AutomorphicNumber {

	public static void main(String[] args) {
		
		int number = 25;
		
		int flag =0; 
		int q = number*number;
		int temp = number;
		
		while(number > 0) {
			
			int d = number% 10;
			int d1 = q % 10;
			
			if(d != d1) {
				flag = 1;
				
			}
			System.out.println(d);
			System.out.println(d1);
			number = number/10;
			q = q/10;
		}
		
		if(flag==0) {
			System.out.println("AutomphicNumber");
		}else {
			System.out.println("Not AutomphicNumber");
		}
	}
}
