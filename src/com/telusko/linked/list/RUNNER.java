 	package com.telusko.linked.list;


import com.telusko.linked.list.LinkedList;

public class RUNNER
{
public static void main(String args[]){
	LinkedList list=new LinkedList();
	list.insert(18);//0th location
	list.insert(20);//1st loc
	list.insert(12);//2nd loc
	list.insert(35);//3rd loc
	list.insert(49);
	list.insert(86);
	//list.insertAtstart(00);
	//list.inserAt(2,100);
	list.deleteAt(2);
	
	list.show();
}
}
