package dSA_450;

public class LongestPlindrome {

	public static void main(String[] args) {
		String S = "aaaabbaa";
		System.out.println(longestPalin(S));
	}
	public static String longestPalin(String S){
		int mxS=S.length();
		int mxE=0;
		for(int i=1;i<S.length();i++) {
			if(S.charAt(i)==S.charAt(i-1)) {
				int s=i-1;
				int e=i;
				while(s>0 && e<S.length() && S.charAt(s)==S.charAt(e)) {
					s--;
					e++;
				}
				mxS=Math.min(mxS, s);
				mxE=Math.max(mxE, e);
			}
		}
		System.out.println(mxS+" "+mxE);
		String res="";
		if(mxE==0)res+=S.charAt(0);
		else {
			for(int i=mxS;i<mxE;i++) {
				res+=S.charAt(i);
			}
		}
		return res;        
    }
}
