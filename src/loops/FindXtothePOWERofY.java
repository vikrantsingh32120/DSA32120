package loops;
import java.util.Scanner;

public class FindXtothePOWERofY {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("find the value of y^x; where y=");
		int y=sc.nextInt();
		
		System.out.print("and x                         =");
		int x=sc.nextInt();
		int c=1;
		
		for(int i=1;i<=x;i++) {
		    c=c*y;   //or c*=a;
		}
		System.out.print("the value of y^x is           ="+c);
	}

}
