package arrays;
import java.util.Scanner;

public class AdditionOfMatrics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter rows:");
		int rows=sc.nextInt();
		System.out.println("enter columns:");
		int cols=sc.nextInt();
		
		int[][] a=new int[rows][cols];
		int[][] b=new int[rows][cols];
		
		System.out.println("enter the element of a[][]:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j]=sc.nextInt();
				}
		}
		System.out.println("enter the elements of b[][]:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int[][] c=new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
//				System.out.print(c[i][j]=a[i][j]+b[i][j]);
//				System.out.print(" ");
			}System.out.println();			
		}
//		System.out.println("a[][]+b[][]=");
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();
//		}
	}

}
