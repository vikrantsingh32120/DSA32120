package oopsLabRajeevTivariSir;

public class AddTwoNum {

	public static void main(String[] args) {
		System.out.print("Name:Alok dixit\nRoll no:R214220129\n");
		int a=Integer.parseInt(args[0]);
		char c=args[1].charAt(0);
		int b=Integer.parseInt(args[2]);
		System.out.println("a="+a+" b="+b);
		switch (c){
		case '+':System.out.println("a+b="+(a+b));
		break;
		case '-':System.out.println("a-b="+(a-b));
		break;
		case '*':System.out.println("a*b="+a*b);
		break;
		case '/':System.out.println("a/b="+((float)a/b));
		break;
		default:System.out.println("invalid operator, please enter bw [+,-,*,/]");
		}

	}

}
