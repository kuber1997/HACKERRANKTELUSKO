package com.infogain.hackerrank;

public class Solution7 {

	public static void main(String[] args) {
		String string1="writetoyourparents";
		String string2="fghmqzldbc";
		boolean arr1[]=new boolean[27];
		boolean arr2[]=new boolean[27];
		//FOR STRING 1
		int string1asc;
		int j;
		for(int i=0;i<string1.length() ;i++)
		{
		string1asc=(int)string1.charAt(i);
		if(string1asc>=97 && string1asc<=122){
			j=string1asc-96;
			arr1[j]=true;
		}
		else if(string1asc>=65 && string1asc<=90){
			j=string1asc-64;
			arr1[j]=true;
		}
		}
		
		// FOR STRING 2
		int string2asc;
		int k;
		for(int i=0;i<string2.length() ;i++)
		{
		string2asc=(int)string2.charAt(i);
		if(string2asc>=97 && string2asc<=122){
			k=string2asc-96;
			arr2[k]=true;
		}
		else if(string2asc>=65 && string2asc<=90){
			k=string2asc-64;
			arr2[k]=true;
		}
		}
		
		int count=0;
		for(int i=0;i<arr1.length && i<arr2.length;i++){
			if(arr1[i]==true && arr2[i]==true){
				count++;
			}
		}
		
		if(count>0){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}

}
