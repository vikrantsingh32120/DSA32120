package gfgProblems;

import java.util.Scanner;

class Rectangle{
	int length;
	int bredth;
	
	public Rectangle(int x,int y) {
		this.length=x;
		this.bredth=y;
	}
	

	public int area() {
		return this.length*this.bredth;
	}
}

class maxArea{
	static int calculate_Area(Rectangle arr[]) {
		Rectangle obj=new Rectangle(0, 0);
		int maxAr=0;
		for(int i=0;i<arr.length;i++) {
			obj.length=arr[i].length;
		    obj.bredth=arr[i].bredth;
			if(obj.area()>maxAr)maxAr=obj.area();
		}
		return maxAr;
	}
}
public class FindRectangleArea {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Rectangle arr[]=new Rectangle[n];
		
		for(int i=0;i<n;i++) {
			int length=sc.nextInt();
			int bredth=sc.nextInt();
			arr[i]=new Rectangle(length, bredth);
		}
		maxArea obj=new maxArea();
		System.out.println(obj.calculate_Area(arr));
	}

}
