package com.infogain.hackerrank;

public class Sol12 {

	public static void main(String[] args) {
		String s[]="My name is Kuber".split(" ");
		String s1="";
		for(int i=s.length-1;i>=0;i--){
			s1=s1+s[i]+" ";
			//System.out.print(s[i]);
		}
		System.out.println(s1);
	}

}
