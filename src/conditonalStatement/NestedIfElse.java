package conditonalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		
//		max of 3 number.
		
		int a=10;		int b=6;		int c=12;
		int result=0;
		
		if(a>b) {
			if(a>c) {
				result=a;
			}else{
				result=c;
			}	
			
		}else {
			if(b>c) {
				result=b;
			}else {
				result=c;
			}
		}
		
		System.out.println(result+" is largest of three number.");
		
		}

}
