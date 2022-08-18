package doWhileLoop;
import java.util.Scanner; 

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=0;
		do{
			n=sc.nextInt();
		}while(n!=0);
		
	}

}
