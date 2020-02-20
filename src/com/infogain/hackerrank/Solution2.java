package com.infogain.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		String s1="kuber";
		char []ch1=s1.toCharArray();
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char []ch2=s.toCharArray();
		String s2="";
		
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				
				if(ch1[i]==ch2[j])
				{
					if(ch2[j]=='k' ){
						s2=s2+ch2[j];
					}
					if(ch2[j]=='u'){
						s2=s2+ch2[j];
					}
					
					if(ch2[j]=='b'){
						s2=s2+ch2[j];
					}
					
					if(ch2[j]=='e'){
						s2=s2+ch2[j];
					}
					if(ch2[j]=='r'){
						s2=s2+ch2[j];
					}
					
					
			
				}
				
		}
	
		
		}
		
		
		
		if(Arrays.equals(s2.toCharArray(), ch1))
		{
		System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		System.out.println(s2);
		
		
	}

}
