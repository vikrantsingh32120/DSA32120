package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a= {4,3,11,7,2};
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {			
			int minInd=i;           //we can use minInd=i+1
			for(int j=i;j<n;j++) {
 			  if(a[j] < a[minInd]) {
				minInd=j;
			}
		}
			int temp=a[i];
			a[i]=a[minInd];
			a[minInd]=temp;
	}
		for(int e:a) {
			System.out.print(e+" ");
		}
	}
}
