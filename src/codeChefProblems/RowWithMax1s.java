package codeChefProblems;

public class RowWithMax1s {
	public static int max1s(int n[][]){
		int maxCount=0;
		int index=0;
		for(int i=0;i<n.length;i++) {
			int count=0;
			for(int j=0;j<n[0].length;j++) {
				if(n[i][j]==1)count++;
			}
			if(count>maxCount) {
				maxCount=count;
				index=i;
			}
		}
		if(maxCount!=0)return index;
		else return -1;
	}

	public static void main(String[] args) {
		int n[][]= {{0,0,1,1},
				    {0,0,0,0},
				    {1,1,1,1},
				    {0,1,1,1}};
		
		System.out.println(max1s(n));
	}

}
