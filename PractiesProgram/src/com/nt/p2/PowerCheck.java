package com.nt.p2;

public class PowerCheck {

	public static void main(String[] args) {
		
		int number = 1000;
		
		boolean result = checkPower(number);
		System.out.println("Check power of Ten::"+result);
	}
	
	public static boolean checkPower(int number) {
		
		boolean result = true;
		
		if(number ==0) {
			result = false;
		}
		
		while(number > 1) {
			
			if(number % 10 != 0) {
				result = false;
			}
			
			number = number/10;
		}
		return result;
	}
}
