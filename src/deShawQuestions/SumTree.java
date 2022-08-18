package deShawQuestions;

public class SumTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int f=1;
    int find(Node root){
        if(root==null)return 0;
        if(root.left==null && root.right==null)return root.data;
        if(f==0)return 0;
        int ls=find(root.left);
        int rs=find(root.right);
        if(root.data!=ls+rs)f=0;
        return root.data+ls+rs;
    }
	boolean isSumTree(Node root)
	{
             // Your code here
             f=1;
             find(root);
             if(f==0)return false;
             return true;
	}
	static class Node{
		int data;
		Node left,right;
		Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
	}
}
