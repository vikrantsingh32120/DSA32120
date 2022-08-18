package conditonalStatement;
import java.util.Scanner;

public class ProjectRatingtool {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter rating-: ");
		int rating=sc.nextInt();
		
		switch(rating) {
		case 1:
		case 2:System.out.print("Bad");
		break;
		case 3:System.out.print("Average");
		break;
		case 4:
		case 5:System.out.print("Good");
		break;
		default:System.out.println("Inviled rating(enter between 1-5;)");
		}
		
		
	}

}
