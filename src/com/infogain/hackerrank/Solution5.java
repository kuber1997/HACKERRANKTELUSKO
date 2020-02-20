package com.infogain.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Solution5 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int no_of_times=sc.nextInt();
		for(int i=0;i<no_of_times;i++){
			System.out.println("enter the number");
			l.add(sc.nextInt());
		}
		int temp1=l.get(0);
		int temp2=l.get(1);
		int order=temp2-temp1;
		
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		boolean result=false;
		for(int i=1,j=2;i<l.size() && j<l.size();i++,j++){
			if(l.get(j)-l.get(i)==order+1){
				order++;
				result=true;
			}
			else{
				result=false;
			}
		}
		System.out.println(result);
		
		//System.out.println(order);
		
		
	}

}
