package dp;

public class MaximalSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// using recursion
    // here i'm using maxi as an array to pass by refrence 
    // we cant use directly 'int a' otherwise it will be pass by value
    int solve(int[][] mat,int i,int j,int[] maxi){
        
       if(i>=mat.length || j>=mat[0].length)
       return 0;
       
       int right=solve(mat, i, j+1, maxi);
       int diagonal=solve(mat, i+1, j+1, maxi);
       int down=solve(mat, i+1, j, maxi);
       
       if(mat[i][j]==1){
           int ans=1+Math.min(right, Math.min(diagonal, down));
           maxi[0]=Math.max(maxi[0], ans);
           return ans;
       }
       else{
           return 0;
       }
    }
    // using memozation
    int solveMem(int[][] mat,int i,int j,int[] maxi,int[][] dp){
        
        if(i>=mat.length || j>=mat[0].length)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        
        int right=solveMem(mat,i,j+1,maxi,dp);
        int diag=solveMem(mat,i+1,j+1,maxi,dp);
        int down=solveMem(mat,i+1,j,maxi,dp);
        
        if(mat[i][j]==1){
            dp[i][j]=1+Math.min(right,Math.min(diag,down));
            maxi[0]=Math.max(maxi[0],dp[i][j]);
            return dp[i][j];
        }
        else
        {
            return dp[i][j]=0;
        }
    }
    
    // using tabulation
    int solveTab(int[][]mat,int[] maxi){
        int rows=mat.length;
        int cols=mat[0].length;
        int dp[][]=new int[rows+1][cols+1];
        
        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=0;j--){
                int right=dp[i][j+1];
                int diag=dp[i+1][j+1];
                int down=dp[i+1][j];
        
                if(mat[i][j]==1){
                    dp[i][j]=1+Math.min(right,Math.min(diag,down));
                    maxi[0]=Math.max(maxi[0],dp[i][j]);
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return dp[rows][cols];
    }
    
    
 // space optimization
    int solveSO(int[][]mat,int[] maxi){
        int rows=mat.length;
        int cols=mat[0].length;
        int curr[]=new int[cols+1];
        int next[]=new int[cols+1];
        
        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=0;j--){
                int right=curr[j+1];
                int diag=next[j+1];
                int down=next[j];
        
                if(mat[i][j]==1){
                    curr[j]=1+Math.min(right,Math.min(diag,down));
                    maxi[0]=Math.max(maxi[0],curr[j]);
                }else{
                    curr[j]=0;
                }
            }
            for(int k=cols;k>=0;k--)next[k]=curr[k];
        }
        return curr[cols];
    }
    
    
    int maxSquare(int n, int m, int mat[][]){
        // code here
//        int maxi[]=new int[1];
//        solve(mat,0,0,maxi);
//        return maxi[0];
        
        // int[][] dp=new int[n][m];
        // for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
        // int[] maxi=new int[1];
        // solveMem(mat,0,0,maxi,dp);
        // return maxi[0];
        
        // int[] maxi=new int[1];
        // solveTab(mat,maxi);
        // return maxi[0];
        
        int[] maxi=new int[1];
        solveSO(mat,maxi);
        return maxi[0];
    }
}
