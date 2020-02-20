package com.infogain.hackerrank;

public class Solution11 {

	public static void main(String[] args) {
		
		String s="aba";
		//long rs=10;
		String asdf="10";
		long rs=Long.valueOf(asdf);
		char arr[]=s.toCharArray();
		
		
		String s1="";
		int j=0;
		for(int i=0;i<=arr.length;i++){
			if(i==arr.length && j<rs){
				System.out.println("in the loop");
				i=0;
			}
			System.out.println("in the body");
			System.out.println(i);
			if (i<arr.length && j<rs){
				s1 = s1 + arr[i];
			}
			j++;
		}
		System.out.println(s1);
		System.out.println(s1.length());
		int count=0;
		
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)=='a'){
				count++;
			}
		}
		System.out.println(count);
	}

}
