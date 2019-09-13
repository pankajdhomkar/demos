package com;

/*public class LinkedList {
	//Head of list
	Node head;
	 /* Linked list Node*/
	/*static class Node{
		int data;
		Node next;
		
		/*Constructor to create a new node 
		 * Next is by default initialize as null
		 */
		/*Node(int d){
			data = d;
			next = null;
		}
	}
	
	public LinkedList insert(LinkedList list, int data){
		//Create new node with given data
		Node new_node = new Node(data);
		new_node.next = null;
		
		// If the Linked List is empty, 
        // then make the new node as head 
		if(list.head == null){
			list.head = new_node;
		}else{
			//Else traverse the list
			Node last = list.head;
			while(last.next != null){
				last = last.next;
			}
			//insert new node 
			last.next = new_node;
		}
		//Return the list by head
		return list;
	}
	
	public void printlist(LinkedList list){
		Node currentNode = list.head;
		System.out.println("LinkedList : ");
		//Traverse the list 
		while(currentNode != null){
			//Print the data
			System.out.println(currentNode.data + " ");
			//Go to next node
			currentNode = currentNode.next;
		}
	}
}
*/

public class LinkedList<T>{
	private Node<T> first;
	
	public LinkedList(){
		first = null;
	}
	
	public void insertFirst(T data){
		Node<T> newNode = new Node<T>(data);
		newNode.next = first;
		first = newNode;
	}
}