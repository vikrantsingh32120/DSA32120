package hackerEarthProblems;

import java.util.Scanner;

public class RedOrGreen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		String S=sc.next();
		int r=0;
		int g=0;
		for(char a:S.toCharArray()) {
			if(a=='R') {
				r++;
			}else {
				g++;
			}
		}
		int min=Math.min(r, g);
		System.out.println(min);
		
	}

}
