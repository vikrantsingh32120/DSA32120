import java.util.*;

public class BakesCake {

	public static void main(String[] args) {
		List<String> ins=new ArrayList<>();
		ins.add("PLACE-a");
		ins.add("PLACE-b");
		ins.add("BUY");
		ins.add("PLACE-b");
		ins.add("CHECK-1-3-b");
		System.out.println(bakes(ins));
	}
	static List<Integer> bakes(List<String> ins){
		char st[]=new char[10000]; //can use Integer.MAX_VALUE
		List<Integer> ans=new ArrayList<>();
		for(String s:ins) {
			if(s.charAt(0)=='P') {
				for(int i=0;i<st.length;i++) {
					if(st[i]==0) {
						st[i]=s.charAt(6);
						continue;
					}
				}
			}
			else if(s.charAt(0)=='B') {
				for(int i=0;i<st.length;i++) {
					if(st[i]!=0) {
						st[i]=0;
						continue;
					}
				}
			}
			else if(s.charAt(0)=='C'){
				int a=(int)s.charAt(8);
				int b=(int)s.charAt(8);
				char c=s.charAt(10);
				int temp=0;
				for(int i=a-1;i<b;i++) {
					if(st[i]==c)temp++;
				}
				ans.add(temp);
			}
		}
		return ans;		
	}
}
