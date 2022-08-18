package oopsLabRajeevTivariSir;

public class DivideByzeroexception {

	public static void main(String[] args) {
		
		try {
			int i=10/0;
		}catch(ArithmeticException e){
			System.out.println("Divide by zero exception catched");
			System.out.println(e.getMessage());
		}

	}

}
