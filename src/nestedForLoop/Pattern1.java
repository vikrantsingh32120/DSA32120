package nestedForLoop;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.print("enter the no. of grid you want to print= ");
		int n=sc.nextInt();
		
		for(int j=1;j<=n;j++) {
			for(int i=1;i<=n;i++) {
				System.out.print("* ");
		}
			System.out.println();
		}
	}

}
