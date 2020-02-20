package com.geeksforgeeks.problems;

import java.util.Arrays;
import java.util.Scanner;
//1. Find a pair in an array of size 'n', whose sum is X
public class sol1 {
	
	 static int pairs(int k, int[] arr) {
		 	/*Arrays.sort(arr);*/
	        /*
	         * 
	         * 
	         * int diff=k;
	        int count=0;
	        for(int i=0;i<arr.length;i++)
	        {   System.out.println("VALUE OF I"+i);
	            for(int j=i+1;j<arr.length;j++)
	            {   System.out.println("VALUE OF J "+j);
	                //System.out.println("ARRAY LENGTH"+arr.length);
	            	System.out.println(Math.abs(arr[i])-Math.abs(arr[j]));
	                if(Math.abs((arr[i])-(arr[j]))==(diff))
	                {
	                    count++;
	                    System.out.println(count);
	                }
	            }
	        }*/
		 	
		 	Arrays.sort(arr);
	       int start=0;
	       int end=1;
	       int count=0;
	       while(start<end)
	       {
	    	   System.out.println("in loop");
	           int diff=Math.abs(arr[end]-arr[start]);
	           if(diff==k){
	               count++;
	               end++;
	           }
	           else if(diff<k){
	               start++;
	           }
	           else if(diff>k){
	               end++;
	           }
	           
	       }
	       System.out.println(count);
	       return count;

		 	
	    
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++){
			System.out.println("enter the element");
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the diff");
		int diff=sc.nextInt();
		
		pairs(diff,arr);
		
	}

}
