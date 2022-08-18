package arrays;
import java.util.Scanner;

public class SubtractionOfMatrics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter n:");
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		int[][] b=new int[n][n];
		
		System.out.println("enter array a:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("enter array b:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					b[i][j]=sc.nextInt();
				}		    
		}
			
			System.out.println("the array c is:");
			int[][] c=new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					c[i][j]=a[i][j]-b[i][j];
					System.out.print(c[i][j]+" ");
				}System.out.println();
			}
	}

	}
