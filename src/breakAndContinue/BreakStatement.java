package breakAndContinue;
import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for( ; ; ) {
			int n=sc.nextInt();
			if(n<0)
				break;
		}
	}

}
