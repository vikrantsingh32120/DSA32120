package tree;

public class CheckIfBTisMaxHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static boolean isHeap(Node root) {
        // code here
		if(root==null)return true;
		if(root.right!=null && (root.right.left!=null || root.right.right!=null)){
		    if(root.left.left==null || root.left.right==null)return false;
		}
		if(root.left!=null && root.left.data>=root.data ||
				root.right!=null && root.right.data>=root.data)
			return false;
		return isHeap(root.left) && isHeap(root.right);
    }

}
