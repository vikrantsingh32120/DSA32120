package codeChefProblems;

import java.util.*;

public class FindTheMissingPointOfParellelogram {
	
	public static double[] findPoint (int A[], int B[], int C[])
    {
        double[] D1=new double[2];
        double[] D2=new double[2];
        double[] D3=new double[2];
        
        
        D1[0]=A[0]+B[0]-C[0];
        D1[1]=A[1]+B[1]-C[1];
        System.out.println(D1[0]+" "+D1[1]);
        
        D2[0]=A[0]+C[0]-B[0];
        D2[1]=A[1]+C[1]-B[1];
        System.out.println(D2[0]+" "+D2[1]);
        
        D3[0]=B[0]+C[0]-A[0];
        D3[1]=B[1]+C[1]-A[1];
        System.out.println(D3[0]+" "+D3[1]);
        
        double x[]={D1[0],D2[0],D3[0]};
        double y[]={D1[1],D2[1],D3[1]};
        double min=x[0];
        int index=0;
        for(int i=0;i<3;i++) {
        	if (x[i]<min) {
        		min=x[i];
        		index=i;
        	}
        }
        double res[]= {x[index],y[index]};
    	return res;
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {848,92};
		int b[]= {829,823};
		int c[]= {90,123};
		double[] n=findPoint(a,b,c);
		System.out.println(n[0]+" "+n[1]);
	}

}
