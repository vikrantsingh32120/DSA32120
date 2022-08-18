package loops;

public class FizzBuzz {

	public static void main(String[] args) {
		String data="";
		for(int i=1;i<=100;i++) {
			data="";
			if(i%3==0) {data+="fizz";}
			if(i%5==0) {data+="buzz";}
			if(data=="") {
				System.out.println(i);
			}
			else {
				System.out.println(data);}
		}

	}

}
