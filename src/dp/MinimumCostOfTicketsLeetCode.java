package dp;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumCostOfTicketsLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//  using recursion;
 int find(int n,int[] days,int[] cost,int idx){
//      base case
     if(idx>=n)return 0;
     
//      1 days pass
     int opt1=cost[0]+find(n,days,cost,idx+1);
     
//      7 days pass
     int i;
     for(i=idx;i<n && days[i]<days[idx]+7;i++);
     int opt2=cost[1]+find(n,days,cost,i);
     
//      30 days pass
     for(i=idx;i<n && days[i]<days[idx]+30;i++);
     int opt3=cost[2]+find(n,days,cost,i);
     
     return Math.min(opt1,Math.min(opt2,opt3));
 }
 
 //     using recursion+memoization;
 int findMem(int n,int[] days,int[] cost,int idx,int[] dp){
//      base case
     if(idx>=n)return 0;
     else if(dp[idx]!=-1)return dp[idx];
     
//      1 days pass
     int opt1=cost[0]+findMem(n,days,cost,idx+1,dp);
     
//      7 days pass
     int i;
     for(i=idx;i<n && days[i]<days[idx]+7;i++);
     int opt2=cost[1]+findMem(n,days,cost,i,dp);
     
//      30 days pass
     for(i=idx;i<n && days[i]<days[idx]+30;i++);
     int opt3=cost[2]+findMem(n,days,cost,i,dp);
     
     dp[idx]= Math.min(opt1,Math.min(opt2,opt3));
     return dp[idx];
 }
 
 //     using Tabulation;
 int findTab(int n,int[] days,int[] cost){
//      base case
     int dp[]=new int[n+1];
     Arrays.fill(dp,Integer.MAX_VALUE);
     dp[n]=0;
     for(int k=n-1;k>=0;k--){
         
//      1 days pass
     int opt1=cost[0]+dp[k+1];
     
//      7 days pass
     int i;
     for(i=k;i<n && days[i]<days[k]+7;i++);
     int opt2=cost[1]+dp[i];
     
//      30 days pass
     for(i=k;i<n && days[i]<days[k]+30;i++);
     int opt3=cost[2]+dp[i];
     
     dp[k]= Math.min(opt1,Math.min(opt2,opt3));
     }
     return dp[0];
 }
 
 
 public class Pair{
     int first;
     int second;
     Pair(int first,int second){
         this.first=first;
         this.second=second;
     }
 }
//spaceOptimization;
 int findTab1(int n,int[] days,int[] cost){
     int ans=0;
     Queue<Pair> week=new LinkedList<>();
     Queue<Pair> month=new LinkedList<>();
     for(int day:days){

         //step1:removing expires days
         while(!month.isEmpty() && month.peek().first+30<=day)month.poll();
         while(!week.isEmpty() && week.peek().first+7<=day)week.poll();

         //push current day
         week.add(new Pair(day,ans+cost[1]));
         month.add(new Pair(day,ans+cost[2]));

         // update ans            
         ans=Math.min(ans+cost[0],Math.min(week.peek().second,month.peek().second));
     }
     return ans;
 }
 public int mincostTickets(int[] days, int[] costs) {
     // return find(days.length,days,costs,0);
     
     // int dp[]=new int[days.length+1];
     // Arrays.fill(dp,-1);
     // return findMem(days.length,days,costs,0,dp);
     
     // return findTab(days.length,days,costs);
     return findTab1(days.length,days,costs);
 }
}
