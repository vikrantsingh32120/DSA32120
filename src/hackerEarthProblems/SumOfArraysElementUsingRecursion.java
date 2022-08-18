package hackerEarthProblems;

public class SumOfArraysElementUsingRecursion {

	public static void main(String[] args) {
		
		int n[]= {3,66,32,5,33};
		System.out.println("sum= "+sum(n));
	}
	public static Long sum(int a[]) {
		Long sum=(long)0;
		for(int i:a) {
			sum+=i;
		}
		return sum;
	}
}
