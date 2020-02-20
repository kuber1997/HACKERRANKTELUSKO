package com.infogain.hackerrank;

public class HackerRankInAString {

	public static void main(String[] args) {
		
		//String s1="hackerrank";
		/*int arr[]=new int[s1.length()];
		for(int i=0;i<s.length();i++){
			for(int j=0;j<s1.length();j++){
				if(s.charAt(i)==s1.charAt(j)){
					arr[j]=arr[j]+1;
				}
			}
		}
		*/
	
		
		boolean temp1=false;
		
		
		
		
		
		/*for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	*/
		
		String s=  "hhhhaaaaackkkkerrrrrrrrank";
		String arr="hackerrank";
        int curr=0;
        for(int i=0;i<s.length();i++){
        	System.out.println(i);
            if(s.charAt(i)==arr.charAt(curr)){
                curr++;
                System.out.println(curr);
            }
        }
        System.out.println(curr);
        System.out.println(arr.length());
        if(curr==arr.length()	){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
	

	}

}
