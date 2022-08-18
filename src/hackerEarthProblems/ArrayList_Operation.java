package hackerEarthProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_Operation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		//char ch[]= {'i','g','i','e','i','e','i','k','i','s','f','e'};
//		ArrayList<Character> list=new ArrayList<Character>(n);
//		ArrayList<Character> list1=new ArrayList<Character>();
//		for(int i=0;i<n;i++) {
//			list.add(i,sc.next().charAt(0));
//		}
//		char ch = 0;
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i)=='i') {
//				list1.add(list.get(i+1));
//				i++;
//			}
//			if(list.get(i)=='f') {
//				ch=list.get(i+1);
//			}
//		}
		ArrayList<Character> clist=new ArrayList<Character>();
		int n=sc.nextInt();
		char c=0;
		for(int i=0;i<n;i++) {
			char ch=sc.next().charAt(0);
			if(ch=='i') {
				clist.add(sc.next().charAt(0));
			}else {
				c=sc.next().charAt(0);
			}
		}
		if(clist.contains(c)) {
			System.out.println(Collections.frequency(clist, c));
		}else {
			System.out.println("Not Present");
		}
//		int count =0;
//		for(char e:list1) {
//			if(e==ch)count++;
//		}
//		System.out.println(count);
	}

}
