package linkedList;

import java.util.*;

public class Sets {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(12);
		set.add(13);
		System.out.println(set.add(12));
		System.out.println(set.add(14));
		System.out.println(set);
		
		Set<Integer> x=new HashSet<>();
		x.add(5);
		x.add(6);
		x.add(8);
		
		Set<Integer> y=new HashSet<>();
		y.add(1);
		y.add(6);
		y.add(2);
//		Sets are mutable...........
		
//		return x union y in x
//		x.addAll(y);
//		System.out.println(x);
		
//		return x intersection y
//		x.retainAll(y);
//		System.out.println(x);
		
//		returns subset;
		System.out.println(x.containsAll(y));
		
		for(int i:x) {
			System.out.println(i);
		}
	}

}
