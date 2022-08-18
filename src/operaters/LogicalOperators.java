package operaters;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int no=20;
		
		if(no>=1 && no<=100) //logical AND operator.
		{
			System.out.println("1-no lies between range of 0 and 100.");
		}
		
		int grade=12;
		
		if(grade==10 || grade==12) //logical OR operator.
		{
			System.out.println("2-you can give board exam now.");
		}
		
		int standerded=12;
		
		if(!(standerded==10 || standerded==12)) //logical NOT operator.
		{
			System.out.println("3-you can not give board exam now");
		}

	}

}
