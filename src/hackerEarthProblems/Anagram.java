package hackerEarthProblems;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0) {
		String S=sc.next();
		String S1=sc.next();
		int A[]=new int[256];
		for(char e:S.toCharArray()) {
			int index=(int)e;
			A[index]++;
		}
		for(char e:S1.toCharArray()) {
			int index=(int)e;
			A[index]--;
		}
		boolean isAnagram =true;
		for(int i=0;i<256;i++) {
			if(A[i]!=0) {
			isAnagram=false;
			break;
			}
		}
		System.out.println(isAnagram);
	}
	}
}
