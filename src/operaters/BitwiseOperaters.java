package operaters;

public class BitwiseOperaters {

	public static void main(String[] args) {
		
		int a=5;
		int b=6;
		
		int c=a&b;
//		the "and" (&) operater,when both x and y is true then the result is true.
		
		System.out.println(c);
		
		int d=a|b;
//		the "or" operater (|), when both x and y is false then the result is false.
		
		System.out.println(d);
		
		int e=a>>1;
//		right shift operater (>>) shift the bit in right of infinity,ex:1111-> 0111;
//				0r we say that the the no. is divide by 2 each every shift; 
		
		System.out.println(e);
		
		int g=3;
		int f=g<<1;
//		left shift operater (<<) shift the bit in left of infinity or we say that the
//		no. is multiply by 2 each and every shift;
		
		System.out.println(f);
		

	}

}
