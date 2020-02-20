package com.telusko.linked.list;

public class LinkedList {
Node head;


public void insert(int data)
	{
	Node node=new Node();
	node.data=data;
	node.next=null;
	
	if(head==null)
	{//WHEN WE ARE NOT HAVING ANY NODE;;;;
		head=node;
	}
	
	else
	{
	//IF HEAD  ABOVE IS NOT A FIRST NODE THEN COME INTO THIS CONDITION 
		Node n=head;// A TEMPORARY NODE THAT WILL HELP US TO TRAVERSE THE DATA.
		while(n.next!=null){
			n=n.next;//THIS WILL SET THE CURRENT NODE TO THE NEXT NODE;
			
	}
		n.next=node;// AS WE ARE AT THE LAST NODE 
		//AND TO SET TO THAT NODE FOR THE NEW NODE.
		
		
		
	}




}
	public void show()
	{
		Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}System.out.println(node.data);
	}

	public void insertAtstart(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;	
	}
	
	public void inserAt(int index,int data)
	{
	Node node=new Node();
	node.data=data;
	node.next=null;
	
	if(index==0){
		insertAtstart(data);
	}
	
	
	else
	{
	Node n=head;
				for(int i=0;i<index-1;i++)
				{
				n=n.next;
				}
	node.next=n.next;
	n.next=node;
	}
	}
	
	public void deleteAt(int index)
	{
		if(index==0)
					{
							head=head.next;
					}
		else
				{
					Node n=head;
					Node n1=null;
				
								for(int i=0;i<index-1;i++)
								{
									n=n.next;
								}
					n1=n.next;
					n.next=n1.next;
					System.out.println("element deleted is"+n1.data);
					
				}
	}



}
