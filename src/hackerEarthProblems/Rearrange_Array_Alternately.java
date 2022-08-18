package hackerEarthProblems;

public class Rearrange_Array_Alternately {

	public static void main(String[] args) {
		int n=6;
		int arr[]={1,2,3,4,5,6};
		int temp[]=new int[n];
		int back=n-1;
		int front=0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				temp[i]=arr[back--];
			}
			else {
				temp[i]=arr[front++];
			}
		}
		arr=temp;
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
