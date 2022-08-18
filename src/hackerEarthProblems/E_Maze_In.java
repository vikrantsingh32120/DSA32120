package hackerEarthProblems;
import java.util.Scanner;
public class E_Maze_In {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next().toUpperCase();
		int x=0;
		int y=0;
		for(char e:a.toCharArray()) {
			if(e=='R') {
				x++;
			}else if(e=='L') {
				x--;
			}else if(e=='U') {
				y++;
			}else {
				y--;
			}
		}
		System.out.println(x+" "+y);
	}

}
