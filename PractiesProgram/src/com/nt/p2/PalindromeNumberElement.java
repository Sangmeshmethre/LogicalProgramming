package com.nt.p2;

public class PalindromeNumberElement {

	public static void main(String[] args) {
		
		int number = 121;
		
		int temp = number;
		int rev = 0;
		while(number !=0) {
			int d = number % 10;
			rev =rev*10+d;
			number = number /10;
		}
		System.out.println(rev);
		
		if(rev==temp) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
