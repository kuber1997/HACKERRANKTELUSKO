package com.infogain.hackerrank;

public class Segreate0and1 {


	public static void main(String[] args) {
		int ar1[]={0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int ar2[]=new int[ar1.length];
		int count1=0,count0=0;
		for(int i=0;i<ar1.length;i++){
			if(ar1[i]==0){
				count0++;
			}
			if(ar1[i]==1){
				count1++;
			}
		}
		
		for(int i=0;i<count0;i++){
			ar2[i]=0;
		}
		for(int j=count0;j<ar2.length;j++){
			ar2[j]=1;
		}
		for(int x:ar2){
			System.out.print(x);
			
		}
	/*	System.out.println(count0);
		System.out.println(count1);*/
	}

}
