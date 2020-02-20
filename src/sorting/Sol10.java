package sorting;

import java.util.*;
import java.util.Map.Entry;

public class Sol10 {

	public static void main(String[] args) {
		
		/////////////////////////////////////HASTABLE
		Hashtable<Integer, String> hm=new Hashtable<>();
		hm.put(101, "B");
		hm.put(102, "A");
		Set set=hm.entrySet();
		Iterator<Set> itr=set.iterator();
		/*while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		
		while(itr.hasNext()){
			Map.Entry entry=(Entry) itr.next();
			System.out.println("The key is"+entry.getKey()+" "+" the value "+entry.getValue());
		}
		
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getValue()+" "+m.getKey());
		}
		
		
		//Java Hashtable Example: getOrDefault()
	    
	        Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
	         map.put(100,"Amit");    
	         map.put(102,"Ravi");   
	         map.put(101,"Vijay");    
	         map.put(103,"Rahul");    
	         //Here, we specify the if and else statement as arguments of the method  
	         System.out.println(map.getOrDefault(101, "Not Found"));  
	         System.out.println(map.getOrDefault(105, "Not Found"));  
	     System.out.println(map);
	     
System.out.println(map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())));
	    

	}

}
