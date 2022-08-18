package operaters;

public class ArithmeticOperaters {

	public static void main(String[] args) {
		
         int a=2;
         int b=5;
         
         int c=a+b;
//    the '+' operater add "a" and" "b".
//         
         int d=a*b;
//    the '*' operater multiply "a" and "b".
//         
         int e=b-a;
//    the '-' operater subtract "a" and "b".
//         
         float f=(float)b/a;
//    the '/' operater devide "a" and "b".
         
         float g=b%a;
//    the modulo '%' operator show reminder when we divide "a" and "b". 
         
         System.out.println(c);
         System.out.println(d);
         System.out.println(e);
         System.out.println(f);
         System.out.println(g);
         
//         to find the value of (a+b)^2,it also follow boadmass rule.
         
         int h=a*a+b*b+2*a*b;
//         System.out.println(h);
         
         int i=b++;
//         i=++b;
//         i=--b;
         
         System.out.println(i+" "+b);
         

	}

}
