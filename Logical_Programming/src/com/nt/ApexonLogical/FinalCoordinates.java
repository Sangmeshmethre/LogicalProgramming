package com.nt.ApexonLogical;

import java.util.Scanner;

/*
Given (0,0) and String - "URRDDL"
Answer : (1,-1)

Additional testcase : String - "DOWN UP 2xRIGHT DOWN 3xLEFT"
Answer : (-1,-1)
*/
public class FinalCoordinates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		int x = 0;
		int y = 0;
		
		for(char word:str.toCharArray()) {
			
			switch(word) {
			case 'U':
				y= y+1;
				break;
			case 'D':
				y=y-1;
				break;
			case 'L':
				x = x-1;
				break;
			case 'R':
				x = x+1;
				break;
				default:
					System.out.println("Invalide Co-ordinates::"+word);
					break;
			}
		}
		System.out.println("Final Co-ordinates::("+x+" "+y+")");
	}
}
