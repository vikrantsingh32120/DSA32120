package hackerEarthProblems;

import java.util.Scanner;

public class CharSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int sum=0;
		for(char i:name.toCharArray()) {
			int index=(int)i-96;
			sum+=index;
		}
		System.out.println(sum);

	}

}
