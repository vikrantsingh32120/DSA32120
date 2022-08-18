package hackerEarthProblems;
import java.util.Scanner;
public class MakeAnagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
		String a=sc.next();
		String b=sc.next();
		int al[]=new int[256];		
		
		for(char e:a.toCharArray()){
			int index=(int)e;
			al[index]++;
		}		
		for(int e:b.toCharArray()) {
			int index=(int)e;
			al[index]--;
		}
		int reqDlt=0;
		for(int i=0;i<al.length;i++) {
			if(al[i]!=0) {				
				if(al[i]>0) {
					reqDlt+=al[i];
				}else {
					reqDlt+=al[i]*(-1);
				}
			}
		}
		
		System.out.println(reqDlt);
		t--;
		}
	}

}
