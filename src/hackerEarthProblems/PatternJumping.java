package hackerEarthProblems;

public class PatternJumping {

	public static void main(String[] args) {
//		frog jumping problem from gfg.
		int N=64;
		boolean reach=false;
        for(int i=1;i<=N;i*=2){
            if(i==N)reach=true;
        }
        System.out.println(reach);
	}

}
