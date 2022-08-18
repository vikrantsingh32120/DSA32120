package breakAndContinue;

public class ContinueStatement {

	public static void main(String[] args) {
		int n=30;
		
		for(int i=1;i<=n;i++) {
			if(i>10 && i<20) {
			continue;	
			}
			System.out.println(i);
		}
	}	
}
