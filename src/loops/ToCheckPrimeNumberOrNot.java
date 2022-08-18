package loops;
import java.util.Scanner;

public class ToCheckPrimeNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		we can use i*i to find out the underroot of n no.
		
		System.out.print("enter number=");
		int n=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
			
		}
		if(n<2) {isPrime=false;}
		System.out.println("isPrime "+isPrime);
	}

}
