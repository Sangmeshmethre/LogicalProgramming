package com.nt.ApexonLogical;


//Check whether a number is a power of 10
public class PowerOfTen {

	public static void main(String[] args) {
		
		int num = 1000;
		
		boolean power = checkPowerTen(num);
		System.out.println(power);
	}
	
	public static boolean checkPowerTen(int number) {
		
		if(number <= 0) {
			return false;
		}
		
		while(number > 1) {
			
			if(number%10 != 0) {
				return false;
			}
			number = number/10;
		}
		return true;
	}
}
