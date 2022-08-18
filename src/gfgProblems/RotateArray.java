package gfgProblems;

public class RotateArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=5;
		int d=2;
		solution s=new solution();
		s.rotateArr(arr, d, n);
		for(int i:arr)System.out.print(i+" ");
	}
}
class solution{
	static void rotateArr(int arr[], int d, int n)
    {
	//code
	 int r=d%n;
	 int arr1[]=new int[n];

	 int index=0;
     for(int i=r;i<n;i++)arr1[index++]=arr[i];
	 for(int i=0;i<r;i++)arr1[index++]=arr[i];
	 for(int i=0;i<n;i++)arr[i]=arr1[i];
    }
}
