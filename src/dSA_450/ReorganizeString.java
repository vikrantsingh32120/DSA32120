package dSA_450;

import java.util.*;
public class ReorganizeString {
	public static void main(String[] args) {
		System.out.println(reorganizeString("aa"));

	}
	public static String reorganizeString(String s) {
        LinkedList<Character> pq=new LinkedList<>();
        for(char ch:s.toCharArray()) {
        	pq.add(ch);
        }
        String str="";
        str+=pq.remove();
        while(pq.isEmpty()) {
        	int i=0;
        	while(i<pq.size()) {
        		if(pq.get(i)!=str.charAt(str.length()-1))str+=pq.remove(i);
        		i++;
        	}
        	return "";
        }
        return str;
    }
}
