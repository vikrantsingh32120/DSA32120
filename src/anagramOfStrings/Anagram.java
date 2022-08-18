package anagramOfStrings;

public class Anagram {

	public static void main(String[] args) {
		
		String a="aab";
		String b="aa";
		
//		boolean visited[]=new boolean[a.length()]; 
//		boolean isAnagram=false;
//		
//		if(a.length()==b.length()) {
//			for(int i=0;i<a.length();i++) {
//			isAnagram=false;
//			int n=a.charAt(i);
//			for(int j=0;j<a.length();j++) {
//				if(b.charAt(j)==n && !visited[j]) {
//					isAnagram=true;
//					visited[j]=true;
//					break;
//				}
//			}
//			if (!isAnagram)break;
//		}
//			}
//		System.out.println("isAnagram: "+isAnagram);
		
		int al[]=new int[256];
//		int bl[]=new int[256];
		boolean isAnagram=true;
		
		
		for(char e:a.toCharArray()){
			int index=(int)e;
			al[index]++;
		}		
		for(int e:b.toCharArray()) {
			int index=(int)e;
//			bl[index]++;
			al[index]--;
		}
		
		for(int i=0;i<al.length;i++) {
//			if(al[i]!=bl[i])isAnagram=false;
			if(al[i]!=0)isAnagram=false;
		}
		
		System.out.println("isAnagram: "+isAnagram);
	}

}
