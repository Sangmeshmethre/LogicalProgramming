package com.nt.p2;

import java.util.Scanner;

public class FinalCordenates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		finalCoordinates(str);
	}
	
	public static void finalCoordinates(String str) {
		
		int x = 0; int y = 0;
		
		for(char direction:str.toCharArray()) {
			
			switch(direction) {
			case 'U':
				y = y+1;
				break;
			case 'D':
				y = y-1;
				break;
			case 'L':
				x = x-1;
				break;
			case 'R':
				x = x+1;
				break;
				default:
					System.out.println("invalide co-ordinates::"+direction);
			}
		}
		System.out.println("final Co-ordinates::("+x+","+y+")");
	}
}
