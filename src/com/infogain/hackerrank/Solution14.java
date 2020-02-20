package com.infogain.hackerrank;



class Solution14
{
public static void main(String []args)
{
	String s1="1234";
	String s2="91011";
	String s3="99100";
	
	//CONVERTING INTO CHAR ARRAY
	char[] cs1=s1.toCharArray();
	char[] cs2=s2.toCharArray();
	char[] cs3=s3.toCharArray();
	
	//FOR ONE DIGIT
	for(int i=1;i<cs1.length;i++){
		if((cs1[i]-cs1[i-1]==1) ){
			System.out.println("YES");
		}
	}
}
}