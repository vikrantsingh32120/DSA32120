package oopsLabRajeevTivariSir;
public class FunctionOverloding1 {
	public static void main(String[] args) {
		Shape s1=new Shape();		
		s1.vol(4);
		s1.vol(2, 6);
		s1.vol(3.0);
	}
}
	class Shape{
		void vol(int side) {
			System.out.println("Area of square is: "+side*side);
		}
		void vol(float b,float h) {
			System.out.println("Area of triangle is: "+0.5*b*h);
		}
		void vol(double r) {
			System.out.println("Area of circle is: "+3.14*r*r);
		}
	}
