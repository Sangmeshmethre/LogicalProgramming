package com.nt.ApexonLogical;

/*Given a string,
return the starting index & length of the longest substring containing the same character.

Example:
String[] str = "aabbbbCCddd";    // Return 2 (index) and substring "bbbb"
*/
import java.util.Scanner;

public class LargestRepitingSubstring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		int[] result = findLargestRepitingSubstring(str);
		System.out.println("starting Index::"+result[0]+", Length::"+result[1]);
		System.out.println("Substring::"+str.substring(result[0], result[0]+result[1]));
	}
	
	public static int[] findLargestRepitingSubstring(String str) {
		
		int maxLength = 0;
		int maxIndex = 0;
		int currentLength = 1;
		int currentIndex = 0;
		
		for(int i=1; i<str.length(); i++) {
			
			if(str.charAt(i) == str.charAt(i-1)) {
				currentLength++;
			}else {
				
				if(currentLength > maxLength) {
					maxLength = currentLength;
					maxIndex = currentIndex;
				}
				currentLength = 1;
				currentIndex = i;
			}
		}
		
		if(currentLength > maxLength) {
			maxLength = currentLength;
			maxIndex = currentIndex;
		}
		
		return new int[] {maxIndex, maxLength};
	}
}
