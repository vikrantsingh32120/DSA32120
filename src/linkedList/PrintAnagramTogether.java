package linkedList;

import java.util.*;

public class PrintAnagramTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public List<List<String>> Anagrams(String[] string_list) {
	        
	        // Your Code here
	        Map<String,List<String>> m=new HashMap<>();
	        for(String s:string_list){
	            char charArr[]=s.toCharArray();
	            Arrays.sort(charArr);
	            String sorted=new String(charArr);
	            if(!m.containsKey(sorted))m.put(sorted,new LinkedList<String>());
	            m.get(sorted).add(s);
	        }
	        List<List<String>> ll=new LinkedList<>();
	        for(String s:m.keySet()){
	            List<String>l=m.get(s);
	            ll.add(l);
	        }
	        return ll;
	    }
	}


}
