package com.infogain.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class CommonSol2 {

	public static void main(String[] args) {
		int arr1[]={1,1,2,2,3,4};
		Arrays.sort(arr1);
		int i=0,j=1;
		int count=0;
		for (int s = 0; s < arr1.length ; s++,i++,j++) {
			while (i <= j && (j < arr1.length - 1 && i < arr1.length - 1) && count <= 3) {
				if (arr1[i] >= arr1[j]) {
					j++;
				}
				if (arr1[i] < arr1[j]) {
					count++;
					i = j;
				}
			} 
		}
		
		System.out.println(count);
		
} 
		

	}


