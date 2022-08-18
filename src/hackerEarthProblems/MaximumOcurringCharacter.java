package hackerEarthProblems;

import java.util.Scanner;

public class MaximumOcurringCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int A[]=new int[256];
		for(char e:str.toCharArray()) {
			int index=(int)e;
			A[index]++;
		}
		int max=0;
		for(int i:A) {
			if(i>max)max=i;
		}
		char maxchar=0;
		for(int i=0;i<256;i++) {
			if(A[i]==max) {
				maxchar=(char)i;
				break;
			}
		}
		System.out.println(maxchar);
	}

}
