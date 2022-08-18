package hackerEarthProblems;

public class Swap_kth_elements {

	public static void main(String[] args) {
		int N = 5;
	    int K = 2;
		int Arr[] = {5, 3, 6, 1, 2};
		int temp=Arr[K-1];
		Arr[K-1]=Arr[N-K];
		Arr[N-K]=temp;
		for(int i:Arr)System.out.print(i+" ");
	}

}
