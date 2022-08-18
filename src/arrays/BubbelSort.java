package arrays;

public class BubbelSort {

	public static void main(String[] args) {
		
		int[] a= {0,1,2,7,5,3};
		int n=a.length;
		boolean sorted=true;
		
		for(int i=0;i<n-1;i++) {    
			for(int j=0;j<n-1-i;j++) {     //we can use i<n-1;
				if( a[j+1] < a[j] ) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorted=false;
					}
				}
			if (sorted) break;
		}
		for(int item:a) {               //by for-each loop
			System.out.print(item+" ");
		}
//		for(int i=0;i<n;i++) {
//			System.out.print(a[i]+" ");
//		}
	}

}
