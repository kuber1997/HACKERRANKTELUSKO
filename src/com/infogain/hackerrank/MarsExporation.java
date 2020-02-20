package com.infogain.hackerrank;

public class MarsExporation {

	public static void main(String[] args) {
		String s="SOSSPSSQSSOR";
		int len=s.length()/3;
		System.out.println(len);
		String s1="";
		for(int i=0;i<len;i++){
			s1=s1+"SOS";
		}
		System.out.println(s1);
		int count=0;
		for(int i=0;i<s1.length();i++){
			if(s.charAt(i)!=s1.charAt(i)){
				count++;
			}
		}
		
		System.out.println(count);
	}

}
