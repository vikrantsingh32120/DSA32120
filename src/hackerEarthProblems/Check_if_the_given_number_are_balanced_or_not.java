package hackerEarthProblems;

public class Check_if_the_given_number_are_balanced_or_not {

	public static void main(String[] args) {
		//Given an integer N which has odd number of digits;
		String N = "1234321";
		int hlf=N.length()/2;
		int sum1=0;
		int sum2=0;
		String num="";
		for(int i=0;i<N.length();i++) {
			num="";
			if(i==hlf)continue;
			num+=N.charAt(i);
			if(i<hlf) {
				sum1+=Integer.parseInt(num);
			}else {
				sum2+=Integer.parseInt(num);
			}
		}
		System.out.println(sum1==sum2);
	}

}
