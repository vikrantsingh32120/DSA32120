package hackerEarthProblems;

public class NumberOfOccurance {

	public static void main(String[] args) {
		int N = 7;
		int X = 2;
		int Arr[] = {1, 1, 2, 2, 2, 2, 3};
		int count=0;
		for(int i:Arr) {
			if(i==X)count++;
		}
		System.out.println(count);
	}

}
