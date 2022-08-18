package arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		int[] marks=new int[9];
//		System.out.println(marks[7]);
		
//		int[] marks;
//		marks=new int[9];
//		System.out.println(marks[7]);
		
		int[] marks= {2, 3, 6, 7, 12};
//		int marks[]= {sc.nextInt()};
		System.out.println(marks[0]+" "+marks[4]);
		marks[0]=4;
		System.out.println(marks[0]);
		marks[0]=marks[4];
		System.out.println(marks[0]);
		System.out.println(marks.length); //length of array.
		
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}
	}

}
