package sorting;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution3 {
    public int Majority(int arr[]){
    	Arrays.sort(arr);
    	int major=arr.length/2;
    	int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length && arr[i] >= arr[j];j++){
				if(arr[j]==arr[i]){
					count++;
				}
				if(count>major){
					return count;
				}
			}
		}
		return -1;
        
    }
    
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of tx");
	int testcase=sc.nextInt();
	while(testcase!=0){
		System.out.println("enter the size");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++){
	    	System.out.println("enter the element");
	        arr[i]=sc.nextInt();
	    }
	    Solution3 ab=new Solution3();
	    int result=ab.Majority(arr);
	    System.out.println(result);
	    testcase--;
	}
	
	}
}