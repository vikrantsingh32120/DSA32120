package dSA_450;

public class MinHeapToMaxHeap {

	public static void main(String[] args) {
		int n=10;
		int arr[] = {3,5,9,6,8,20,10,12,18,9};
		convertMinHeapToMax(arr, n);
		for(int i:arr)System.out.print(i+" ");
	}
	public static void convertMinHeapToMax(int arr[],int n) {
		 for (int i = (n-2)/2; i >= 0; --i) {
	            downHeapify(arr, i, n);
	    }
	}
	public static void downHeapify(int arr[],int i,int n) {
		int lc=2*i+1;
		int rc=2*i+2;
		int largest=i;
		if(lc<n && arr[lc]>arr[i])largest=lc;
		if(rc<n && arr[rc]>arr[largest])largest=rc;
		if(largest!=i) {
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			downHeapify(arr, largest, n);
		}
	}
}
