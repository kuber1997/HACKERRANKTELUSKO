package sorting;

import java.util.Scanner;

public class Sol2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine();
		
		for(int i=0;i<inp.length();i++)
		{
		char letter=inp.charAt(i);
		char iptolowercase=Character.toLowerCase(letter);
		int ascii_value=(int)iptolowercase;
		int position=ascii_value-96;
		System.out.print(position);
		
		}
		
	}

}
