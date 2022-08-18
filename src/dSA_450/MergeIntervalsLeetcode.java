package dSA_450;

import java.util.*;

public class MergeIntervalsLeetcode {

	public static void main(String[] args) {
		int intervals[][]= {{1,3},{3,3},{3,6},{8,10},{15,18}};
		int res[][]=merge(intervals);
		for(int i[]:res) {
			System.out.println(i[0]+" "+i[1]);
		}
	}
	static int[][] merge(int[][] intervals) {
		int n=intervals.length;
		if(n<2)return intervals;
		Arrays.sort(intervals,(a,b)-> Integer.compare(a[0], b[0]));
		Stack<Intervals> s=new Stack<Intervals>();
		s.push(new Intervals(intervals[0][0],intervals[0][1]));
		for(int i=0;i<n;i++) {
			int s1=s.peek().start;
			int e1=s.peek().end;
			int s2=intervals[i][0];
			int e2=intervals[i][1];
			
			if(s2>e1) {
				s.push(new Intervals(s2,e2));
				continue;
			}
			s.pop();
			s.push(new Intervals(s1,Math.max(e1, e2)));
		}
		int res[][]=new int[s.size()][2];
		int i=s.size()-1;
		while(s != null && s.size()>0) {
			res[i][0]=s.peek().start;
			res[i][1]=s.peek().end;
			s.pop();
			i-=1;
		}
		return res;
	}
}
class Intervals{
	int start;
	int end;
	Intervals(){
		start=0;
		end=0;
	}
	Intervals(int s, int e){
		start=s;
		end=e;
	}
}
