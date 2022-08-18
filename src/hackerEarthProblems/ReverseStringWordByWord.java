package hackerEarthProblems;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		System.out.println(reverseString(" vikrant    singh  "));
	}
public static String reverseString(String s) {
	s=s.strip();
    String str[]=s.split(" ");
    String newStr="";
    for(int i=str.length-1;i>=0;i--){
        if(str[i].isEmpty())continue;
        newStr+=str[i]+" ";
    }
    newStr=newStr.trim();
    return newStr;
}
}
