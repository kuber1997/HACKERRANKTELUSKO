package com.infogain.hackerrank;

public class Solution9 {

	public static void main(String[] args) {
		String temp1="FIRE";
		String result[]=new String[50];
		int ind=0;
		for(int i=0;i<temp1.length();i++){
			 String curr ="";
			for(int j=i;j<temp1.length();j++){
				curr += temp1.charAt(j);
			}
			result[ind++] = curr;
		}
		for(int k=0;k<result.length;k++){
			
				System.out.println(result[k]);
		
		}

}
}