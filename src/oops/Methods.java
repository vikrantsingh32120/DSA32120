package oops;

public class Methods {

	public static void main(String[] args) {
		int result=maxOf(32,3);
		System.out.println(result);
		sayHi();
	}
	
//	static void maxOf(int a,int b) {
//		if(a>b) {
//			System.out.println(a);
//		}
//		else {
//			System.out.println(b);
//		}
//	}
	static int maxOf(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good Morning");
	}
}
