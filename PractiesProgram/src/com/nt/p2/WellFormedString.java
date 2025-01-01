package com.nt.p2;

import java.util.Scanner;
import java.util.Stack;

public class WellFormedString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(st.isEmpty()) {
				st.push(ch);
			}else if(ch=='[' || ch=='(' || ch=='<' || ch=='{'){
				st.push(ch);
			}else if(ch==']'&&st.peek()=='[' || ch=='>' && st.peek()=='<' || ch==')' && st.peek()=='(' || ch=='}' && st.peek()=='{') {
				st.pop();
			}
		}
		
		if(str.isEmpty()) {
			System.out.println("Well forme string");
		}else {
			System.out.println("Not well formed String");
		}
	}
}
