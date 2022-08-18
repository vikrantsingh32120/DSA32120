package gfgProblems;

public class OccuraranceInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a11472o5t6";
		String s1="";
		int count[]=new int[s.length()];
		for(char c:s.toCharArray()) {
			String s2="";
			s2+=c;
			if(s1.contains(s2)) {
				int index=s1.indexOf(c);
				count[index]++;
			}else {
				try {
					Integer.parseInt(s2);
					s1+=c;
					int index=s1.indexOf(c);
					count[index]++;
				}catch (Exception e) {
					continue;
				}
			}
			
		}
		
		for(int i:count) {
			System.out.print(i+" ");
		}

	}

}
