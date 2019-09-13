package com;

public class Node<T> {
	public T data; // data node
	public Node<T> next; //next pointer
	
	//constructor
	public Node(T data) {
		this.data = data;
	}
	
	//display
	public void displayNode(){
		System.out.println(data + "");
	}
}
