package oopsLabRajeevTivariSir;

public class MethodOverriding {
	
	public static void main(String[] args) {
			B1 sub=new B1(3,9,4);
//			calling overridden method;
			sub.show();
			
			A1 sup=new A1(8,7);
//			calling the original method of super class;
			sup.show();
	}
}
//super class;
class A1{
	int i,j;
	A1(int a,int b) {
		i=a;
		j=b;
	}
	
	void show() {
		System.out.println("i="+i+" j="+j);
	}
}

//subclass extends A;
class B1 extends A1{
	int k;
	B1(int a,int b,int c) {
		super(a,b);
		k=c;
	}
	@Override //overriding show method;
	void show() {
		System.out.print("k="+k);
		System.out.println(" i="+i+" j="+j);
	}
}