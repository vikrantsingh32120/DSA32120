package Introduction;

import java.util.Scanner;

public class LengthOfTwoDarrays {	
	static int hourglassSum(int[][] arr) {
        int sum=-100;           //important
        for(int i=0;i<arr.length-2;i++){
            int temp=-100;           //important
            for(int j=0;j<arr[0].length-2;j++){
                int upper=arr[i][j]+arr[i][j+1]+arr[i][j+2];
                int middle=arr[i+1][j+1];
                int lower=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                temp=upper+middle+lower;
                System.out.println("temp="+temp);
              if(temp>sum){
                  sum=temp;
                  System.out.println(sum);
              } 
              
            }
        }
        
		return sum;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int arr[][]=new int[3][6];
//		System.out.println(arr.length+" "+arr[0].length);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(hourglassSum(a));
	}

}
