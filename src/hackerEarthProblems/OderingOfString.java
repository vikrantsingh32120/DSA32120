package hackerEarthProblems;
import java.util.Arrays;
import java.util.Scanner;

public class OderingOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0) {
			int n=sc.nextInt();
			String[] A=new String[n];
			int i=0;
			for(String e:A) {
				A[i++]=sc.next();
			}
			Arrays.sort(A);
			System.out.println(A[0]+" "+A[n-1]);
			//System.out.println(Arrays.toString(A));
		  }
		}		
	}
