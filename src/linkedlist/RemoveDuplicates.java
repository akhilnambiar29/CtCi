package linkedlist;

import java.util.ArrayList;
import java.util.List;

//You can use hashing as well here.
public class RemoveDuplicates {
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
        RemoveDuplicates list = new RemoveDuplicates();
        list.head = new Node(10);
        list.head.next = new Node(12);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(12);
        list.head.next.next.next.next.next = new Node(11);
        list.head.next.next.next.next.next.next = new Node(10);
 
        System.out.println("Linked List before removing duplicates : \n ");
        list.printList(head);
 
        list.remove_duplicates();
        System.out.println("");
        System.out.println("Linked List after removing duplicates : \n ");
        list.printList(head);
    }

	private void remove_duplicates() {
		// TODO Auto-generated method stub
		if(head == null){
			return;
		}
		else{
			List<Integer> list = new ArrayList<>();
			list.add(head.data);
			Node node = head;
			while(node.next!=null){
				if(list.contains(node.next.data)){
					node.next = node.next.next;
					//node = node.next;
				}
				else{
					list.add(node.next.data);
					node = node.next;
				}
			}
		}
	}
    
    
}
