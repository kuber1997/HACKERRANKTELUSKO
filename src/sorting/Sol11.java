package sorting;

import java.util.Arrays;

public class Sol11 {

	public static void main(String[] args) {
		String ip="a";
		char []a=ip.toCharArray();
		//System.out.println(a.length);
		int start=0;
		int end=a.length-1;
		boolean result=false;
		if(a.length==1){
            result=true;
            
        }
		while(start<end){
			if(a[start]==a[end] && a.length!=1){
				start++;
				end--;
				result=true;
			}
			else if(a[start]!=a[end] && a.length!=1) {
				
				result=false;
				break;
			}
		}
		System.out.println(result);
	}

}
