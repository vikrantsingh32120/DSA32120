package hackerEarthProblems;
import java.util.*;
public class CaseSpecificSortingOfString {

	public static void main(String[] args) {
		String s="defRTSersUXI";
		String lowerCase="";
		String upperCase="";
		for(char e:s.toCharArray()) {
			if((int)e>=97 && (int)e<=122)lowerCase+=e;
			else upperCase+=e;
		}
		char[] lower=lowerCase.toCharArray();
		char[] upper=upperCase.toCharArray();
		Arrays.sort(upper);
		Arrays.sort(lower);
		
		String S1="";
		int upperIndex=0;
		int lowerIndex=0;
		for(char e:s.toCharArray()) {
			if((int)e>=97 && (int)e<=122) {
				S1+=lower[lowerIndex];
				lowerIndex++;
			}
			else {
				S1+=upper[upperIndex];
				upperIndex++;
			}
		}
		System.out.println(s);
		System.out.println(S1);
	}

}
