package arrays;

import java.util.Scanner;

public class MultiplicationOfMatrics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter rows:");
		int rows=sc.nextInt();
		System.out.print("enter column:");
		int clmn=sc.nextInt();
		int[][] a=new int[rows][clmn];
		int[][] b=new int[rows][clmn];
		
		System.out.println("enter a[][]:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<clmn;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter b[][]:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<clmn;j++){
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("result c[][]=a[][]*b[][]:");
		int[][] c=new int[rows][clmn];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<clmn;j++) {
				c[i][j]=0;
				for(int k=0;k<rows;k++) {
					c[i][j]+=a[i][k]*b[k][j];					
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
