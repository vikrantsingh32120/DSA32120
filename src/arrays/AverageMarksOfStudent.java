package arrays;
import java.util.Scanner;

public class AverageMarksOfStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the number of student=");
		int n=sc.nextInt();
		int marks[]=new int[n];
		
		System.out.println("enter the marks now");
		for(int i=0;i<n;i++) {
			 marks[i]=sc.nextInt();
		}
		
		int averageMarks=0;
		for(int i=0;i<n;i++) {
			averageMarks+=marks[i];
		}
		averageMarks/=n;
		System.out.print("the average marks are "+averageMarks);
	}

}
