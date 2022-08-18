package gfgProblems;

public class GoldCoine {

	public static void main(String[] args) {
		int n=8; 
		String s = "10010100";
		boolean res=true;
		int count=0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='0') {
				count+=1;
		}
		}
		if(count%2!=0)res=false;
		System.out.println(res);
	}

	}
