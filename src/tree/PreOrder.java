package tree;

import java.util.Scanner;

public class PreOrder {

	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		Node root=bt.createTree();
		System.out.println("inOrder traversal:");
		bt.inOrder(root);
		System.out.println("\npreOrder traversal:");
		bt.preOrder(root);
		System.out.println("\npostOrder traversal:");
		bt.postOrder(root);
	}
	static class BinaryTree{
		Scanner sc=new Scanner(System.in);
		public Node createTree() {
			Node root=null;
			System.out.print("Enter data: ");
			int data=sc.nextInt();
			if(data==-1)return null;
			root=new Node(data);
			System.out.println("Enter left for "+data);
			root.left=createTree();
			System.out.println("Enter right for "+data);
			root.right=createTree();
			return root;
		}
//		inOrder traversal
		public void inOrder(Node root){
			if(root==null)return;
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
//		preOrder traversal
		public void preOrder(Node root){
			if(root==null)return;
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
//		postOrder traversal
		public void postOrder(Node root){
			if(root==null)return;
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	static class Node{
		Node left;
		Node right;
		int data;
		Node(int data) {
			this.data=data;
		}
	}

}

