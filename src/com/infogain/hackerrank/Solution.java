package com.infogain.hackerrank;

import java.util.HashSet;
import java.util.Iterator;

class Solution{
	public static void main(String args[]){
		
		String s="beabeefeab";
		HashSet<Character> hm=new HashSet<>();
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			hm.add(c[i]);
		}
		char[] ch1=new char[hm.size()];
		int j=0;
		for(char a:hm){
			ch1[j]=a;
			j++;
		}
		
			
	}
}