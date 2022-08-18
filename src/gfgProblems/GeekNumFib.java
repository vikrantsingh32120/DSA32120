package gfgProblems;

import java.util.ArrayList;

public class GeekNumFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Long> GeekNum=new ArrayList<>();
		GeekNum.add((long) 0);
		GeekNum.add((long) 1);
		GeekNum.add((long) 2);
		System.out.println(solve(8, 3, GeekNum));
		
		

	}
	static long solve(int N, int K, ArrayList<Long> GeekNum) {
		 //code here
        long sum=0;
        int i=N-K;
        while(i-- >0){
            sum=0;
            for(int j=GeekNum.size()-K;j<GeekNum.size();j++){
            sum+=GeekNum.get(j);
        }
        GeekNum.add(sum);
        }
        long solve=GeekNum.get(N-1);
        return solve;
    }

}
