package com.nt.p2;

import java.util.Scanner;

public class AtoiFunction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string::");
		String str = sc.nextLine();
		
		System.out.println("Convert String to Integer::"+myAtoiFunction(str));
	}
	
	public static int myAtoiFunction(String str) {
		
		int i =0;
		int result = 0;
		int sing = 1;
		
		if(str==null || str.isEmpty()) {
			return -1;
		}
		
		str = str.trim();
		
		if(str.charAt(0)=='-') {
			sing = -1;
			i++;
		}
		if(str.charAt(0)=='+') {
			i++;
		}
		while(i < str.length()) {
			
			char ch = str.charAt(i);
			
			if(ch < '0' || ch >'9') {
				return -1;
			}
			result = result*10+(ch-'0');
			i++;
		}
		return sing*result;
	}
}
