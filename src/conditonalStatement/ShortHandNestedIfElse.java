package conditonalStatement;

public class ShortHandNestedIfElse {

	public static void main(String[] args) {

		int a=12; int b=4; int c=3;
		int result=0;
		
		result=a>b?a>c?a:c:b>c?b:c;
		
		System.out.println(result+" is the largest of three number.");
	}

}
