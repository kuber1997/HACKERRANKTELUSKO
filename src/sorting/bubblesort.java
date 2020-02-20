package sorting;

import java.util.Arrays;

public class bubblesort {

	public static void main(String[] args)

	{
		String s="12:05:45PM";
		String temp1=s.substring(0, 2);
		int temp2=Integer.parseInt(temp1);
		
		
		if(s.contains("AM") && temp2==12)
		{
			String blogName =s.substring(0, 8);
			 String[] arrSplit = blogName.split(":");
			 int time=0;
			 String padded = String.format("%02d" , time);
			 System.out.println(padded+":"+arrSplit[1]+":"+arrSplit[2]);
			 
			 
		}
		
		else if(s.contains("AM") )
		{
			String blogName =s.substring(0, 8);
			 String[] arrSplit = blogName.split(":");
			 System.out.println(arrSplit[0]+":"+arrSplit[1]+":"+arrSplit[2]);
			 
			 
		}
		else if(s.contains("PM") && temp2==12)
		{
			String blogName =s.substring(0, 8);
			 
			 System.out.println(blogName);
		}
		
		
		else if(s.contains("PM"))
		{
			String blogName =s.substring(0, 8);
			 String[] arrSplit = blogName.split(":");
			 String as=arrSplit[0];
			 int ab=Integer.parseInt(as);
			 ab=ab+12;
			 System.out.println(ab+":"+arrSplit[1]+":"+arrSplit[2]);
		}
		
		
		
		
		
	}}

	


