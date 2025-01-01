package com.nt.BePracticalTechPrograms;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		String str = "sangmeshmethre";
		
		char[] ch = str.toCharArray();
		
		int count;
		for(int i=0; i<ch.length; i++) {
			count = 0;
			
			if(ch[i]=='0')
				continue;
			
			for(int j=i+1;j<ch.length; j++) {
				
				if(ch[i]==ch[j] && count==0) {
					System.out.print(ch[i]+" ");
					
					ch[j] = '0';
					count++;
				}
			}
		}
	}
}
