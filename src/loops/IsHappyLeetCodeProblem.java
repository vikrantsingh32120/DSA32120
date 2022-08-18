package loops;

public class IsHappyLeetCodeProblem {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.isHappy(10));

	}
	static class Solution {
	    public boolean isHappy(int n) {
	    	while (n != 4 ) {
	            int sum = 0;
	            while (n != 0) {
	                sum += Math.pow(n%10, 2);
	                n /= 10;
	            }
	            n = sum;
	            if(n == 1){
	                return true;
	            }
	        }
	        return false;
	    }
	}

}
