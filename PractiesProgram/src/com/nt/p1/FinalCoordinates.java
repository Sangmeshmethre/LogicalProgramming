package com.nt.p1;

import java.util.Scanner;

public class FinalCoordinates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		finalcoordinates(str);
	}
	
	public static void finalcoordinates(String str) {
		
		int x =0, y =0;
		
		for(char directory:str.toCharArray()) {
			
			switch(directory) {
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
					System.out.println("invalid coordinates:"+directory);
			}
		}
		System.out.println("Final Coordinates::("+x+","+y+")");
	}
}
