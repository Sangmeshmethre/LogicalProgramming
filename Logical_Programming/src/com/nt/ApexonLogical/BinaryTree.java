package com.nt.ApexonLogical;

//Write a program to print the inorder traversal of a binary tree.

class Node{
	int data;
	Node left, right;
	
	public Node(int data) {
		this.data = data;
		left= right=null;
	}
}
public class BinaryTree {

	Node root;
	
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.root.right.right = new Node(6);
		
		bt.InOrderBinaryTree(bt.root);
	}
	
	public void InOrderBinaryTree(Node node) {
		
		if(node == null) {
			return;
		}
		
		InOrderBinaryTree(node.left);
		System.out.println(node.data+" ");
		InOrderBinaryTree(node.right);
	}
}
