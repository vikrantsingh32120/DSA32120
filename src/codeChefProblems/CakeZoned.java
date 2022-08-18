package codeChefProblems;
import java.util.*;
public class CakeZoned {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int H[]=new int[n];
		H=arrayFiller(H);
		int Q=sc.nextInt();
		for(int i=0;i<Q;i++) {
			int task=sc.nextInt();
			if(task==1) {
				int L=sc.nextInt();
				int R=sc.nextInt();
				int X=sc.nextInt();
				H=arrayElementsIncrese(H,L,R,X);
			}
			else if(task==2) {
				int sum=sumOfOddArrays(H);
				System.out.println(sum);
			}
			else {
				int sum=sumOfEvenArrays(H);
				System.out.println(sum);
			}
		}
		
		
	}
	
	static int sumOfOddArrays(int n[]) {
		int sum=0;
		for(int i=0;i<n.length;i+=2) {
			sum+=n[i];
		}
		return sum;
	}
	
	static int sumOfEvenArrays(int n[]) {
		int sum=0;
		for(int i=1;i<n.length;i+=2) {
			sum+=n[i];
		}
		return sum;
	}
	
	static int[] arrayElementsIncrese(int n[],int L,int R,int X){
		for(int i=L-1;i<R;i++) {
			n[i]=n[i]+X;
		}
		return n;
	}
	
	static int[] arrayFiller(int n[]){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n.length;i++) {
			n[i]=sc.nextInt();
		}
		return n;
	}

}
