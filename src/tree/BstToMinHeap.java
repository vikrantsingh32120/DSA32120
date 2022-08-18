package tree;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

import tree.PreOrder.BinaryTree;
public class BstToMinHeap {

	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		
		Queue<Integer> arr=new ArrayDeque<>();		
//		tree.PreOrder.Node root=bt.createTree();	
		Node root = new Node(4);
	    root.left = new Node(2);
	    root.right = new Node(6);
	    root.left.left = new Node(1);
	    root.left.right = new Node(3);
	    root.right.left = new Node(5);
	    root.right.right = new Node(7);
		inOrder1(root, arr);
		System.out.println();
		preOrder1(root, arr);
		
		System.out.print(root.data+" ");
		System.out.print(root.left.data+" ");
		System.out.print(root.right.data+" ");
		System.out.print(root.left.left.data+" ");
		System.out.print(root.left.right.data+" ");
		System.out.print(root.right.left.data+" ");
		System.out.print(root.right.right.data+" ");

	}
	static void inOrder1(Node root,Queue<Integer> arr) {
		if(root==null)return;
		inOrder1(root.left,arr);
		arr.add(root.data);
		System.out.println(root.data);
		inOrder1(root.right, arr);
	}
//	static int index=0;
	static void preOrder1(Node root,Queue<Integer> arr) {
		if(root==null)return;
		root.data=arr.poll();
		System.out.println(root.data);
		preOrder1(root.left, arr);
		preOrder1(root.right, arr);
	}

}
