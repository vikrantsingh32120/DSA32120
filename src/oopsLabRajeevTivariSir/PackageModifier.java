package oopsLabRajeevTivariSir;
public class PackageModifier {
	public static void main(String[] args) {
		Test1 ob = new Test1();
		// These are OK, a and b may be accessed directly
		ob.a = 10;
		ob.b = 20;		
		// This is not OK and will cause an error
		// ob.c = 100; // Error!
		// You must access c through its methods
		ob.setc(100); // OK
		System.out.println("a, b, and c "+ob.a+" "+
		ob.b+ " " +ob.getc());
		
		A superOb = new A();
		 B subOb = new B();
		 // The superclass may be used by itself.
		 superOb.i = 10;
		 superOb.j = 20;
		 System.out.println("Contents of superOb: ");
		 superOb.showij();
		 System.out.println();
		 /* The  subclass has access to all  members of
		 its superclass. */
		 subOb.i = 7;
		 subOb.j = 8;
		 subOb.k = 9;
		 System.out.println("Contents of subOb: ");
		 subOb.showij();
		 subOb.showk();
		 System.out.println();
		 System.out.println("Sum of i, j and k in subOb:");
		 subOb.sum();
		 }
		}	

	class Test1 {
	int a; // default access
	public int b; // public access
	private int c; // private access

	// methods to access c
	void setc(int i) { // set c's value
	c = i;
	}
	int getc() { // get c's value
	return c;
	}
	}

	 // Create a superclass.

	 class A {
	 int i, j;
	 protected void showij() {
	 System.out.println("i and j: "+i+ " " +j);
	 }
	 }

	 // Create a subclass by extending class A.
	 class B extends A {
	 int k;
	 void showk() {
	 System.out.println("k: " + k);
	 }
	 void sum() {
	 System.out.println("i+j+k: " + (i+j+k));
	 }
	 }
