package oopsLabRajeevTivariSir;

public class Area {

	public static void main(String[] args) {
		
		int b=Integer.parseInt(args[0]);
		int h=Integer.parseInt(args[1]);
		System.out.println("area of triangle="+tringle(b, h));
		int r=Integer.parseInt(args[2]);
		System.out.println("area of circle="+circle(r));
		int s=Integer.parseInt(args[3]);
		System.out.println("area of square="+square(s));
	}
	public static double tringle(int b,int h) {
		return 0.5*b*h;
	}
	public static double circle(int r) {
		return 3.14*r*r;
	}
	public static double square(int s) {
		return s*s;
	}
}
