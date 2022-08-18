package gfgProblems;
import java.util.*;
public class PrintAnagramTogrther {

	public static void main(String[] args) {
		String s[]= {"act","god","cat","dog","tac"};
		int s1[]=new int[s.length];
//		int index[]=new int[s.length];
//		for(int i=0;i<s.length;i++) {
//			index[i]=i;
//		}
		for(int i=0;i<s.length;i++) {
			for(int a:s[i].toCharArray()) {
				s1[i]+=a;
			}
		}
		for(int i=0;i<s1.length-1;i++) {
			for(int j=1;j<s1.length-i;j++) {
				if(s1[j]<s1[j-1]) {
					int temp1=s1[j];
					s1[j]=s1[j-1];
					s1[j-1]=temp1;
					String temp=s[j];
					s[j]=s[j-1];
					s[j-1]=temp;
				}
			}
		}
		for(String a:s) {
			System.out.print(a+" ");
		}
	}
}
