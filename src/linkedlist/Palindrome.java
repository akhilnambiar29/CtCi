package linkedlist;

import java.util.Stack;

public class Palindrome {
	class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
        Node(){}
    }
	
	
	public boolean getPalindrome(Node head){
		//System.out.println(value);
		if(head==null){
			return false;
		}
		else{
			Stack<Integer> stack = new Stack<Integer>();
			Node node = head;
			Node tempnode = head;
			
			while(node!=null){
				stack.push(node.data);
				node = node.next;
			}
			
			while(tempnode!=null){
				if(tempnode.data != stack.pop()){
					System.out.println("Not a palindrome");
					break;
				}
				tempnode = tempnode.next;
			}
		}
		
		return false;
	}

}
