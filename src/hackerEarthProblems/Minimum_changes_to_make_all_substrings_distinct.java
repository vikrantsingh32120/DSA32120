package hackerEarthProblems;

public class Minimum_changes_to_make_all_substrings_distinct {

	public static void main(String[] args) {
		String S="aebaecedabbee";
		int a[]=new int[256];
		int count=0;
		for(char e:S.toCharArray()) {
			int index=(int)e;
			a[index]++;
			if(a[index]>1) {
				count++;

			}
		}
		System.out.println(count);
	}

}
