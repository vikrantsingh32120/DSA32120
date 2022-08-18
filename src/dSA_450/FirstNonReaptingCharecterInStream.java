package dSA_450;
import java.util.*;
public class FirstNonReaptingCharecterInStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="iergxwhddh";
		System.out.println(FirstNonRepeating(A));

	}
	 public static String FirstNonRepeating(String A)
	    {
	        // code here
//		 don't use String in this, its give TLe use StringBuilder;
	        Queue<Character> q=new LinkedList<>();
	        Map<Character,Integer> freq=new HashMap<>();
	        StringBuilder ans=new StringBuilder("");
	        for(int i=0;i<A.length();i++) {
	        	char ch=A.charAt(i);
	        	q.add(ch);
	        	if(freq.containsKey(ch)) {
	        		freq.put(ch, freq.get(ch)+1);
	        	}
	        	else {
	        		freq.put(ch, 1);
	        	}
	        	while(!q.isEmpty()) {
	        		char front=q.peek();
	        		if(freq.get(front)==1) {
	        			ans.append(front);
	        			break;
	        		}else {
	        			q.poll();
	        		}
	        	}
	        	if(q.isEmpty())ans.append('#');;	        	
	        }
	        return ans.toString();
	    }

}
