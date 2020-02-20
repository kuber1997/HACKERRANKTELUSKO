package com.infogain.hackerrank;

import java.util.Scanner;

public class Solution13 {

	public static void main(String[] args) {
		//left rotation
		Scanner sc=new Scanner(System.in);
		int arr1size=sc.nextInt();
		int arr1[]={85,72,45,56,89};//array1
		int d=2;
		int temp[]=new int[d];//array2
		for(int i=0;i<=d-1;i++)
		{
			temp[i]=arr1[i];
		}
		int temp2[]=new int[arr1.length];//array3
		
		for(int j=d,l=0;j<arr1.length;j++,l++)
		{
			temp2[l]=arr1[j];
		}
		for(int p=arr1.length-d,k=0;p<temp2.length && k<temp.length;p++,k++)
		{
			temp2[p]=temp[k];
		}
		for(int g:temp2)
		{
			System.out.println(g);
		}
		
		
		}
	}


