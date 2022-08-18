package conditonalStatement;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		int dayOfWeek=6;
		
		switch(dayOfWeek) {
		case 1:System.out.println("i am in office.");
		break;
		case 2:System.out.println("i am on leave.");
		break;
		case 3:System.out.println("i am on official trip.");
		break;
		case 4:System.out.println("i am playing football.");
		break;
		default:System.out.println("i don'know what the day it is.");
		}
	}

}
