package com.nt.p2;

public class RevesedString {

	public static void main(String[] args) {
		
		String str = "Hi.Sangmesh.How.are.U";
		
		String rev = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			rev = ch+rev;
		}
		System.out.print(rev);
	}
}
