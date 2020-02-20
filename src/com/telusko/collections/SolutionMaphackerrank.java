package com.telusko.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SolutionMaphackerrank {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of tc");
		int no_tc=sc.nextInt();
		sc.nextLine();
        Map<String,Integer> pb=new HashMap<>();
        while(no_tc!=0){
            System.out.println("Enter the name and number");
            String temp1=sc.nextLine();
            System.out.println("enter the number");
            int temp2=sc.nextInt();
            
            if(temp1.split(" "))
            pb.put(temp1,temp2);
            sc.nextLine();
            
            no_tc--;
            
            
        }
       // Scanner sc=new Scanner(System.in);
        
        
        while(sc.hasNext()){
        	//System.out.println("enter the key");
        	String temp3=sc.next();
        	//System.out.println(pb.get(temp3));
        	if(pb.get(temp3)!=null){
        		System.out.println(pb.get(temp3));
        	}
        	else{
        		System.out.println("NOt found");
        	}
        }
        
        
        
      /*  Set<Entry<String, Integer>> values=pb.entrySet();
    	
    	for(Entry<String, Integer> e:values)
    	{	System.out.println("Enter the key");
    		System.out.println(e.getKey()+" "+e.getValue());
    	}*/
	}

}
