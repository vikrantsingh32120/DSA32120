package recursionAndBackTracking;

import java.util.*;

public class GetSubSequence {

	public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> res=gss(str);
        System.out.print(res);
    }

    public static ArrayList<String> gss(String str) {
        if(str.equals("")){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rres=gss(ros);
        ArrayList<String> mres=new ArrayList<>();
        for(String rstr:rres)mres.add(""+rstr);
        for(String rstr:rres)mres.add(ch+rstr);
        return mres;
    }

}
