package com.datastructures.linkedlist;

public class Node {
Node next;
int data;
public Node(int data){
	this.data=data;
}
public void append(int data){
	Node current=this;
	while(current.next!=null){
		current=current.next;
	}
}


}
