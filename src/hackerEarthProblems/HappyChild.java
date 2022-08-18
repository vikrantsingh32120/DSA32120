package hackerEarthProblems;

import java.util.Scanner;

public class HappyChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int n=sc.nextInt();
		    int c=sc.nextInt();
		    
		    int child[]=new int[n];
		    for(int i=0;i<n;i++){
		        child[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++){
		   sum+=child[i]; 
		}
		if(sum==c){System.out.println("Yes");}
		else{
		    System.out.println("No");
		}
	}

	}

}
