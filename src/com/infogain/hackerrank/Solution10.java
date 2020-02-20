package com.infogain.hackerrank;

public class Solution10 {

	public static void main(String[] args) {
		String s1="hackerrank";
		String s2="hereiamstackerrank";
		String s3="";
		for(int i=0;i<s2.length();i++){
			if(s2.charAt(i)=='h' ||s2.charAt(i)=='a' ||s2.charAt(i)=='c' ||s2.charAt(i)=='k' ||s2.charAt(i)=='r' ||s2.charAt(i)=='n' ||s2.charAt(i)=='e' ){
				s3=s3+s2.charAt(i);
			}
			
		}
		
		System.out.println(s3);
	}

}
