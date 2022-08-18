package hackerEarthProblems;

public class FindSumOfNumInString {

	public static void main(String[] args) {
		String str="1avndb23";
		long result=0;
		for(int i=0;i<str.length();) {
			int num=0;
			
			while(i<str.length() && (int)str.charAt(i)>=48 && str.charAt(i)<=57) {
				num=num*10+Character.getNumericValue(str.charAt(i));
				i++;
			}
			result+=num;
			if(num==0)i++;
		}
		System.out.println(result);
	}

}
