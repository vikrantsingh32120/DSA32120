package linkedList;

import java.util.*;
import java.util.Map.Entry;

public class Maps {

	public static void main(String[] args) {
		Map<String,Integer> m=new LinkedHashMap<>();
		m.put("one", 1);
		m.put("two", 2);
		m.put("three",3);
		m.remove("one");
		m.put("one", 1);
//		System.out.println(m);
//		m.put("one", 10);
//		System.out.println(m);
//		m.putIfAbsent("one", 100);
//		System.out.println(m);
//		
//		System.out.println(m.get("one"));
//		System.out.println(m.get("six"));
//		
//		m.replace("one",10,1);
//		m.replace("one", 10);
//		
//		m.remove("one");
//		m.remove("two",3);
//		System.out.println(m);
//		System.out.println(m.keySet());
//		System.out.println(m.values());
//		System.out.println(m.entrySet());
		
		for(String key:m.keySet()) {
			System.out.println(m.get(key));
		}
//		
//		Set<Entry<String,Integer>> st=m.entrySet();
//		Scanner sc=new Scanner(System.in);
//		for(Entry<String,Integer> e:st) {
//			String key=e.getKey();
//			int val=e.getValue();
//			m.replace(key, val,sc.nextInt());
//		}

		System.out.println(m);
	}

}
