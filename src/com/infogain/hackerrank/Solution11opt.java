package com.infogain.hackerrank;

public class Solution11opt {

	public static void main(String[] args) {
		long sum=0;
		String s="ojowrdcpavatfacuunxycyrmpbkvaxyrsgquwehhurnicgicmrpmgegftjszgvsgqavcrvdtsxlkxjpqtlnkjuyraknwxmnthfpt";int count=0;
		String s2="685118368975";
		long len=Long.valueOf(s2)/s.length();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'){
				count++;
			}
			
		}
		long result=count*len;
		int modu=10%s.length();
		for(int i=0;i<modu;i++){
			if(s.charAt(i)=='a'){
				result++;
			}
		}
		System.out.println(result);
}
}