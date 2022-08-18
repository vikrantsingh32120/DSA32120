package oopsLabRajeevTivariSir;

public class ParameterizedConstructorAndConstructorOverLoading {
	
	public static void main(String[] args) {
		Box1 b1=new Box1();
		b1.l=1;
		b1.b=2;
		b1.h=5;
		b1.vol();		
		Box2 b2=new Box2();
		b2.l=5;
		b2.b=4;
		b2.h=10;
		b2.vol();		
		Box2 b3=new Box2(4,6,10);
		b3.vol();
	}

}
//default or empty constructor.
class Box1{	
	int l;
	int b;
	int h;
	void vol() {
		System.out.println("Volume of box1: "+l*b*h);
	}
}
//parameterized constructor with constructor overloading.
class Box2{
	int l;
	int b;
	int h;
	Box2(){};
	Box2(int l,int b,int h){
		this.l=l;
		this.b=b;
		this.h=h;
	}
	void vol() {
		System.out.println("Volume of box2: "+l*b*h);
	}
}