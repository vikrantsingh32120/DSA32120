package dSA_450;

import java.util.ArrayList;

public class RearrangeString {
	
public static char findMaxChar(int arr[],String s) {
	int max=0;
	int indx=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
			indx=i;
		}
	}
	indx+=97;
	if(canReorganize(max,s.length())==0)return 0;
	return (char)indx;
}

public static String reorganizeString(String s) {
	int arr[]=new int[26];
	for(int i=0;i<s.length();i++) {
		arr[(int)s.charAt(i)-97]++;
	}
	char mx=findMaxChar(arr,s);
	if(mx!=0)
	return null;
    }

	public static void main(String[] args) {
		System.out.println(reorganizeString("aaabb"));
	}

}
