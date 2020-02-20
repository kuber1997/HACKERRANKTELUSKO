package sorting;

import java.util.Arrays;

public class Sol8 {

	public static void main(String[] args) {
		int []arr={1,2,3,4,5};
		int k=2;
		
		int []arr2=new int[arr.length];
		int i=0;
		for(int j=k;j<arr.length;j++)
		{
			arr2[i]=arr[j];
			i++;
		}
		
		for(int j=0;j<=k;j++){
			arr2[i]=arr[j];
			i++;
			
		}
		
		System.out.println(Arrays.toString(arr2));

	}

}
