package sorting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Sol4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldDate = "29 MARCH 2019";  
		System.out.println("Date before Addition: "+oldDate);
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
		Calendar c = Calendar.getInstance();
		try{
		   c.setTime(sdf.parse(oldDate));
		}catch(ParseException e){
		   e.printStackTrace();
		 }
		//Incrementing the date by 1 day
		c.add(Calendar.DAY_OF_MONTH, 4);  
		String newDate = sdf.format(c.getTime());  
		System.out.println("Date Incremented by One: "+newDate);
		
		
		/*SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the date dd/MM/yyyy");
	    String st=sc.next();
		try {  
	    	
	        Date date = formatter.parse(st);  
	        
	        System.out.println("Date is: "+date);  
	    } catch (ParseException e) {e.printStackTrace();}  */

	}

}
