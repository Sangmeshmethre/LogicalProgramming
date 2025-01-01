package com.nt.ApexonLogical;

import java.util.Scanner;
import java.util.Stack;

public class ParanthicisString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter String::");
		String str = sc.nextLine();
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(st.isEmpty()) {
				
				st.push(ch);
				
			}else if(ch=='{'||ch=='(' || ch=='[') {
				
				st.push(ch);
				
			}else if(ch=='}' && st.peek()=='{') {
				
				st.pop();
				
			}else if(ch==')' && st.peek()=='(') {
				
				st.pop();
				
			}else if(ch==']' && st.peek()=='[') {
				
				st.pop();
			}
		}
		
		if(st.isEmpty()) {
			System.out.println("Given String is Well formed");
		}else {
			System.out.println("Given String is Not Well formed");
		}
	}
}
