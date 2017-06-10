package linkedlist;

import linkedlist.RemoveDuplicates.Node;

//create three linkedlists with values less than n , equal to n and greater than n , then concatenate.
public class Partition {
		public Node getPartition(Node head, int n){
			
			Node node = head;
			Node smallNode = null;
			Node equalNode = null;
			Node bigNode = null;

			while(node!=null){
				if(node.data==n){
					equalNode = new Node(node.data);
					equalNode = equalNode.next;
				}
				else if(node.data>n){
					bigNode = new Node(node.data);
					bigNode = bigNode.next;
				}
				else if(node.data<n){
					smallNode = new Node(node.data);
					smallNode = smallNode.next;
				}
				node= node.next;
			}
			
			while(smallNode!= null && smallNode.next!=null){
				smallNode = smallNode.next;
			}
			smallNode = equalNode;
			while(equalNode!=null && equalNode.next!=null){
				equalNode = equalNode.next;
			}
			
			equalNode = bigNode;
			
			
			
			return smallNode;
		}
		
		static Node head;
		 
	    static class Node {
	 
	        int data;
	        Node next;
	 
	        Node(int d) {
	            data = d;
	            next = null;
	        }
	    }
	    
	    void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	 
		
		public static void main(String[] args) {
			Partition list = new Partition();
	        list.head = new Node(1);
	        list.head.next = new Node(4);
	        list.head.next.next = new Node(3);
	        list.head.next.next.next = new Node(2);
	        list.head.next.next.next.next = new Node(5);
	        list.head.next.next.next.next.next = new Node(2);
	        list.head.next.next.next.next.next.next = new Node(3);
	 
	        System.out.println("Linked List created : \n ");
	        list.printList(head);
	 
	        list.getPartition(head,3);
	        System.out.println("");
	        System.out.println("Linked List after partition : \n ");
	        list.printList(head);
	    }

}
