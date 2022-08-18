package hackerEarthProblems;

import java.util.Scanner;
import java.util.Arrays;

public class RevarseEachWordInGivenString_SaperatedByDot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-- >0) {
		String S=sc.next();
		//String S1[]=S.split("\\.");
		String S2=S.replace(".", ",");
		String[] S1=S2.split(",");
		String new_string="";
		
		for(int i=0;i<S1.length;i++) {
			char[] ch=S1[i].toCharArray();
			String word="";
			for(int j=ch.length-1;j>=0;j--) {
				word+=ch[j];
			}
			new_string+=word+" ";
		}
		String s1=new_string.strip();
		s1=s1.replace(" ", ".");
		System.out.print(s1);
		}
		}
}


