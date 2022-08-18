package conditonalStatement;

public class ElseIfStatement {
	public static void main(String[]args) {
		
		int No=10;
		
		if(No<10) {
			System.out.println("no is less than 10.");
		}else if(No>=10 && No<=20) {
			System.out.println("no is lies between 10 and 20.");
		}else if(No>=20 && No<=30) {
			System.out.println("no is lies between 20 and 30.");	
		}else {
			System.out.println("no is greater than 30.");
		}

      
	}

}
