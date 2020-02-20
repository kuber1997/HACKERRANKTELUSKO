package com.infogain.hackerrank;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {

	public static void main(String[] args) {
		/*int []arr1={1,1,1,1,1,1};
		List<Integer> list=new ArrayList<Integer>
		(Arrays.asList
	(2,5, 1 ,3 ,4, 4, 3, 5, 1, 1 ,2 ,1 ,4, 1 ,3, 3, 4 ,2 ,1));
		int k=1,j=7;
		int sum=18;
		int count=0;
		
		for (int k1 = 0; k1 < list.size(); k1++) {
			if (j == 1 && list.get(0) == sum) {
				count++;
			} else {
				while (i <= j) {
					int k = list.get(i) + list.get(j);
					if (k == sum) {
						count++;
						i++;
						j--;

					} else {
						i++;
						j--;
					}

				}
			} 
		}
		
		
		
		
		
		
		System.out.println(count);
		//System.out.println(list.size());
		
		List<Integer> s=new ArrayList<>();	
		Object[] arr=s.toArray();
	*/
		
		/*List<Integer> list=new ArrayList<Integer>
		(Arrays.asList
	(4, 5 ,4 ,5, 1, 2, 1, 4 ,3 ,2, 4,4, 3 ,5 ,2, 2 ,5 ,4 ,3 ,2 ,3
			,5 ,2 ,1 ,5, 2, 3 ,1, 2,3, 3, 1, 2, 5));
		*/
		List<Integer> list=new ArrayList<Integer>
		(Arrays.asList
	(1, 2, 1, 3, 2));
		
		int sum=3;
		int size=2;int count=0;
		System.out.println(list.size());
		
		int total_sum_counter=((list.size())/size);
		System.out.println("total_sum_counter"+total_sum_counter);
		for(int i=0;i<total_sum_counter;i++){
			int temp_sum=0;int j=0;
			int k=0;
			k+=size;
			for(j=0;j<k;j++){
				temp_sum=temp_sum+list.get(j);
				
				if(temp_sum==sum){
					count++;
				}
			
			}
			
		}
		
		System.out.println(count);
		
	
		
		

	}

}
