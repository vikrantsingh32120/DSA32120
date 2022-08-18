package hackerEarthProblems;
import java.util.*;
public class CountTheElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Given two arrays A and B. Given Q queries each having a positive integer i 
//		denoting an index of the array A. For each query, your task is to find 
//		all the elements less than or equal to Ai in the array B.
//		Input:
//		The first line contains a single integer T, the number of test cases. The 
//		first line of each test case consists of a integer N. The second and third 
//		line of each test case consists of N spaced integers representing array A 
//		and array B respectively. The third line contains a positive integer Q, 
//		denoting the number of queries. Next Q lines contains queries.
//		Output: 
//		For each testcase, print the required answer.
//		Example:
//		Input:
//		1
//		6
//		1 2 3 4 7 9
//		0 1 2 1 1 4
//		2
//		5
//		4 
//		Output:
//		6
//		6
	    
		int t=sc.nextInt();
		while(t-- >0){
		int n=sc.nextInt();
		int A[]=new int[n];
		int B[]=new int[n];
		for(int i=0;i<n;i++){
		    A[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    B[i]=sc.nextInt();
		}
		int Q=sc.nextInt();
		while(Q-- >0){
		    int count=0;
		    int q1=sc.nextInt();
		    int x=A[q1];
		    for(int i=0;i<n;i+=2){
		    	System.out.println(i+"i");
		       if (B[i]<=x){
		           count++;
		       }
		       if (i<=n-2 && B[i+1]<=x){
		           count++;
		           System.out.println("i+1"+(i+1));
		       }
		    }
		    System.out.println(count);
		}
		}

	}

}
