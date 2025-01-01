package com.nt.p2;

public class ReversedWord {

	public static void main(String[] args) {
		
		String str = "Hi.Sangmesh.How.are.U";
		//str = str+" ";
		String word = "";
		String revsed ="";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
				
			}else {
				revsed = word+revsed;
				word="";
				revsed="";
			}
		}
		System.out.println(revsed);
		
	}
}
