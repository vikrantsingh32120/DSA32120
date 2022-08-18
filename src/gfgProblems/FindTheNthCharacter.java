package gfgProblems;

public class FindTheNthCharacter {
	
	public static char solve(String s, int n, int r)
    {
        //code here
        while(r-- >0) {
		String s1="";
		for(char a:s.toCharArray()) {
			if(a=='1')s1+="10";
			else if(a=='0')s1+="01";
		}
		s=s1;
		}
		return s.charAt(n);
    }

	public static void main(String[] args) {
		String s = "101";
		int r = 2;
		int n=3;
		System.out.println(solve(s,n,r));
	}

}
