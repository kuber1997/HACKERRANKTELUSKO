package com.infogain.hackerrank;

public class Solution8 {

	public static void main(String[] args) {
		//String s="aaaaaaAAAAAaaaAAAABBBBBBbbbbBBBBBbBcccCCdDDhhA";
		
				String s="We promptly judged antique ivory buckles for the next prize ";
				boolean arr[]=new boolean[27];
				int count=0;
				
				//System.out.println(s1);
				int s1;
				int j;
				for(int i=0;i<s.length() ;i++)
				{
				s1=(int)s.charAt(i);
				if(s1>=97 && s1<=122){
					j=s1-96;
					arr[j]=true;
				}
				else if(s1>=65 && s1<=90){
					j=s1-64;
					arr[j]=true;
				}
				}
				
				for(int k=0;k<arr.length;k++){
					if(arr[k]==true){
						count++;
					}
				}
				//System.out.println(count);
				
				if(count>=26){
					System.out.println("yes a panagram");
				}
				else{
					System.out.println("not a panagram");
				}
		
	}

}
