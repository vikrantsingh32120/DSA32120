package hackerEarthProblems;

import java.util.Scanner;

public class Zoos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next().toLowerCase();
		int x=0;
		int y=0;
		int n[]=new int[256];
		for(char i:name.toCharArray()) {
			int index=(int)i;
			n[index]++;
		}
//		int indexOfZ='z';
//		x=n[indexOfZ];
//		int indexOfY='o';
//		y=n[indexOfY];
		for(char e:name.toCharArray()) {
			if(e=='z')x++;
			if(e=='o')y++;
		}
		if(2*x==y)System.out.println("Yes");
		else System.out.println("No");
	}

}
