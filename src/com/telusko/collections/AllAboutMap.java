package com.telusko.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AllAboutMap {
public static void main(String args[]){
	Map<String, String> pb=new HashMap<>();
	pb.put("kuber", "Sharma");
	pb.put("manac", "verma");
	pb.put("ali", "zafar");
	
	//for getting the value for the given number.
	//System.out.println(pb.get("Kuber"));
	/*Set<String> keys=pb.keySet();
	for(String i:keys){
		System.out.println(pb.get(i));
	}*/
	
	Set<Map.Entry<String,String>> values=pb.entrySet();
	
	for(Map.Entry<String, String> e:values)
	{
		System.out.println(e.getKey()+" "+e.getValue());
	}
	
}
}
