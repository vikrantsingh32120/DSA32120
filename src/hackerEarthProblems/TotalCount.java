package hackerEarthProblems;

import java.util.Scanner;

public class TotalCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*Given an array Arr of N positive integers
		and a number K where K is used as a 
		threshold value to divide each element 
		of the array into sum of different numbers.
		Find the sum of count of the numbers 
		in which array elements are divided.
		
Input:
N = 4, K = 3
Arr[] = {5, 8, 10, 13}
Output: 14
Explanation: Each number can be expressed as sum 
of different numbers less than or equal to K as
5 (3 + 2), 8 (3 + 3 + 2), 10 (3 + 3 + 3 + 1), 
13 (3 + 3 + 3 + 3 + 1). So, the sum of count 
of each element is (2+3+4+5)=14. */
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		int sum=0;
		int Arr[]=new int[n];
		for(int i=0;i<n;i++) {
			Arr[i]=sc.nextInt();
			if(Arr[i]%k==0) {
				sum+=Arr[i]/k;
				}
			else {
				sum+=Arr[i]/k+1;
			}
		}
		System.out.println(sum);
	}

}
