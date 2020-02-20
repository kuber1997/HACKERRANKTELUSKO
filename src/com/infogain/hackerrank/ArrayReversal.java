package com.infogain.hackerrank;

public class ArrayReversal {

	public static void main(String[] args) {
		int a1[]={3,5,2,9};
		int a2[]=new int[a1.length];
		for(int i=a1.length-1,j=0;i>=0;i--,j++){
			a2[j]=a1[i];
		}
			for(int y:a2){
				System.out.println(y);
			}

	}

}
