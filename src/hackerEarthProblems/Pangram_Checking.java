package hackerEarthProblems;

import java.util.Scanner;

public class Pangram_Checking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
		boolean isPangram[]=new boolean[256];
		for(char e:s.toCharArray()) {
			if((int)e>=97 && (int)e<=122) {
				int index=(int)e;
				isPangram[index]=true;
			}
		}		
		boolean Pangram = false;
		for(int i=97;i<=122;i++) {
			Pangram=isPangram[i];
			if(!Pangram)break;
		}
		System.out.println(Pangram);
	}

}
