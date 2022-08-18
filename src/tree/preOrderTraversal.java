package tree;
import java.util.*;
public class preOrderTraversal {

	public static void main(String[] args) {
		// question link:
//		https://practice.geeksforgeeks.org/contest/coding-try-outs-amazon/problems

	}

}
class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
	static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> bt=new ArrayList<>();
    	preOrder(root,bt);
    	return bt; 
    }
    static void preOrder(Node root,ArrayList<Integer> arr){
        if(root==null)return;
        arr.add(root.data);
    	preOrder(root.left,arr);
    	preOrder(root.right,arr);
    }

}
class Node{
  int data;
  Node left,right;
  Node(int d){
      data=d;
      left=right=null;
  }
}
