package recursionAndBackTracking;

public class KnightWalkGFG {

	public static void main(String[] args) {
//		this solution gives TLE on GFG try KnightWalkGFG1
		int n=6;
		int[][] chess=new int[n][n];
		steps=n*n+1;
		int kr=0,kc=0;
		int tr=3,tc=4;
		minStepsByKnight(chess,kr,kc,tr,tc,0);
		if(steps==n*n+1)System.out.println(0);
		else System.out.println(steps);
	}
	public static int steps;
	public static void minStepsByKnight(int[][] chess,int kr,int kc,int tr,int tc,int move) {
		if(kr<0 || kc<0 || kr>=chess.length || kc>=chess.length || chess[kr][kc]>0|| move==chess.length*chess.length) {
			return;
		}else if(kr==tr && kc==tc){
			chess[kr][kc]=move;
//			displayBoard(chess);
			if(chess[tr][tc]<steps) {
				steps=chess[tr][tc];
				System.out.println("chess[tr][tc]:"+chess[tr][tc]);
			}
			chess[kr][kc]=0;
			return;
		}
		
		chess[kr][kc]=move;
		minStepsByKnight(chess,kr-2,kc+1,tr,tc,move+1);
		minStepsByKnight(chess,kr-1,kc+2,tr,tc,move+1);
		minStepsByKnight(chess,kr+1,kc+2,tr,tc,move+1);
		minStepsByKnight(chess,kr+2,kc+1,tr,tc,move+1);
		minStepsByKnight(chess,kr+2,kc-1,tr,tc,move+1);
		minStepsByKnight(chess,kr+1,kc-2,tr,tc,move+1);
		minStepsByKnight(chess,kr-1,kc-2,tr,tc,move+1);
		minStepsByKnight(chess,kr-2,kc-1,tr,tc,move+1);			
		chess[kr][kc]=0;
	}
	public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

}
