package recursionAndBackTracking;

import java.util.*;

public class PrintSubSequence {
	public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        printSS(sc.next(),"");
    }

    public static void printSS(String str, String ans) {
        if(str.equals("")){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        
        printSS(ros,ans+ch);
        printSS(ros,ans+"");
    }
}
