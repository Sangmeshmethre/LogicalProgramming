package com.nt.p1;

class Node{
	
	int data;
	Node left, right;
	
	public Node(int v) {
		data = v;
		left = right = null;
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
		
		bt.inOrderBinaryTree(bt.root);
	}
	
	void inOrderBinaryTree(Node node) {
		
		if(node==null) {
			return;
		}
		
		inOrderBinaryTree(node.left);
		System.out.println(node.data+" ");
		inOrderBinaryTree(node.right);
	}
}
