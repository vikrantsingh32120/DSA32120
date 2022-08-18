package Introduction;

import java.util.Scanner;

public class Doubt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-- >0){
		int N=sc.nextInt();
		char ch[]=new char[N];
		String S="";
		for(int i=0;i<N;i++){
		    ch[i]=sc.next().charAt(0);
		    S+=ch[i];
		}
		System.out.println(S);
	}

	}

}
