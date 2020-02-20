package com.infogain.hackerrank;

public class CommonSOL {

	public static void main(String[] args) {
		String []aofstring={"aba","baba","aba","xzxb"};
		String []aofqueries={"aba","xzxb","ab"};
		int arr[]=new int[aofqueries.length];
		
		for(int i=0;i<aofqueries.length;i++){
			int count=0;
			for(int j=0;j<aofstring.length;j++){
				if(aofqueries[i].equals(aofstring[j])){
					count++;
				}
				arr[i]=count;
			}
		}
		for(int x:arr)
		System.out.println(x);
	}

}
