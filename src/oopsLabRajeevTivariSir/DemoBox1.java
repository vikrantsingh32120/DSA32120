package oopsLabRajeevTivariSir;

public class DemoBox1 {

	public static void main(String[] args) {
		Box b1=new Box();
		b1.setDim(10,2,5);
		int v1=b1.volume();
		System.out.println("v1="+v1);
		Box b2=new Box();
		b2.setDim(3,2,5);
		int v2=b2.volume();
		System.out.println("v2="+v2);
	}
	public static class Box{
		int l;
		int b;
		int h;
		public void setDim(int l,int b,int h) {
			this.l=l;
			this.b=b;
			this.h=h;
		}
		public int volume() {
			return l*b*h;
		}
	}

}
