package deShawQuestions;

public class WaterOverFlowGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int K = 3, R = 2, C = 1;
		System.out.println(waterOverflow(K, R, C));
	}
	static double waterOverflow(int K, int R, int C) {
        // code here
        double [][] dp=new double[K+1][K+1];
        dp[0][0]=K;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<=i;j++){
                dp[i][j]=(int)(1);
                if(dp[i][j]>1){
                    double spare=dp[i][j]-1;
                    dp[i+1][j]=spare/2.0;
                    dp[i+1][j+1]=spare/2.0;
                }
            }
        }
        int ans=(int)dp[R-1][C-1];
        return ans;
    }
}
