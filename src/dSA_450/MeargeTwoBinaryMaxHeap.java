package dSA_450;

public class MeargeTwoBinaryMaxHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int m = 3;
		int a[] = {10, 5, 6, 2}; 
		int b[] = {12, 7, 9};
		
		Solution1 s=new Solution1();
		int ans[]=s.mergeHeaps(a, b, n, m);
		for(int i:ans)System.out.print(i+" ");
	}
}
class Solution1{
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        // your code here
		int ans[]=new int[n+m];	
		int i=0;
		for(;i<n;i++) {
			ans[i]=a[i];
			if(i!=0)upHeapify(ans, i);
		}
		for(int j=0;i<n+m;i++,j++) {
			ans[i]=b[j];
			upHeapify(ans, i);
		}
		return ans;
    }
	public void upHeapify(int arr[],int i) {
		if(i==0) return;
		int pi=(i-1)/2;
		if(arr[pi]<arr[i]) {
			swap(arr, pi,i);
			upHeapify(arr, pi);
		}
	}
	
	public void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
