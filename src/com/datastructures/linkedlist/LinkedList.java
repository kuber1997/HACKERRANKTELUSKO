package com.datastructures.linkedlist;

import java.util.Scanner;

public class LinkedList {

	    Node head;//head of the list
	    
	    
	/* Linked list Node. This inner class is made static so that 
		main() can access it */
	static class Node{
		int data;
		Node next;
		
		
		public Node(int data) {
			super();
			this.data = data;
			next=null;
			//CONSTRUCTOR 
			
		}
	}
	
	
	/* This function prints contents of linked list starting from head */
		public void printlist()
		{
			Node n=head;
			while(n!=null){
					System.out.println(n.data+" ");
					n=n.next;
					
			}
		}
		
		public void push(int new_data)
		{
			/* 1 & 2: Allocate the Node & 
            Put in the data*/
			Node new_node=new Node(new_data);
			/* 3. Make next of new Node as head */
			new_node.next=head;
			/* 4. Move the head to point to new Node */
			head=new_node;
		}
		
		public void insertAfter(Node prev_node,int new_data)
		{
			/* 1. Check if the given Node is null */
			if(prev_node==null){
				System.out.println("PREVIOUS NODE CANNOT BE NULL");
				return;
			}
			/* 2. Allocate the Node & 
		       3. Put in the data*/
			Node new_node=new Node(new_data);
			
			 /* 4. Make next of new Node as next of prev_node */
			new_node.next=prev_node.next;
			
			 /* 5. make next of prev_node as new_node */
			prev_node.next=new_node;
			
		}
		
		public void append(int new_data){
			/* 1. Allocate the Node & 
		       2. Put in the data 
		       3. Set next as null-->It is automatically done as given in constructor */
			
			Node new_node=new Node(new_data);
			
			/* 4. If the Linked List is empty, then make the 
	           new node as head */
			
			if(head==null)
			{
				head=new Node(new_data);
				return;
			}
			
			
			 /* 4. This new node is going to be the last node, so 
	         make next of it as null */
			new_node.next=null;
			
			/* 5. Else traverse till the last node */
			Node last=head;
			while(last.next!=null){
				last=last.next;
			}
			
			 /* 6. Change the next of last node */
			last.next=new_node;
			return;
		}
		
	
	
	
	/* method to create a simple linked list with 3 nodes*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList llist=new LinkedList();
		llist.append(6);
		llist.push(7);
		llist.push(1);
		llist.append(4);
		llist.printlist();
		
		
		
		
		
		
		/* Start with the empty list. */
			/*LinkedList llist=new LinkedList();*/
			/*llist.head=new Node(1);
			Node second=new Node(2);
			Node thrid=new Node(3);
			
			llist.head.next=second;
			second.next=thrid;
			
			
			
			
			
			//entering the data into the Beginning
			System.out.println("enter the data to be inserted in the begining");
			Scanner sc=new Scanner(System.in);
			llist.push(sc.nextInt());
			
			
			//insert in between
			
				llist.insertAfter(llist.head.next.next, 8);
				
				
			
			
			
			//printing the data of the linkedList
			llist.printlist();
		*/
			
	}
	
	

}
