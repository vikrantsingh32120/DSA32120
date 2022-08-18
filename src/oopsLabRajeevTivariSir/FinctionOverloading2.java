package oopsLabRajeevTivariSir;
public class FinctionOverloading2 {
	public static void main(String[] args) {
		Test t1=new Test();
		t1.t();
		t1.t(4);
		t1.t(6,3);
		t1.t(36.0, 2.0);
		int cube=t1.t(2.0);
		System.out.print("  And its cube is= "+cube);
	}
}
class Test{
	void t() {
		System.out.println("Right now! There are NO PARAMETERS");
	}
	void t(int x) {
		System.out.println("The value of X is: "+x);
	}
	void t(int x,int y) {
		System.out.println("The value of X is: "+x+" | The value of Y is: "+y);
	}
	void t(double a,double b) {
		System.out.println("The value of "+a+"/"+b+" is: "+a/b);
	}
	int t(double a) {
		System.out.print("The value of a is: "+a);
		return (int)((int)a*a*a);
	}
}
