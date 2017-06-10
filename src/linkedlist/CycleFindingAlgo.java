package linkedlist;

public class CycleFindingAlgo {

	
	/* Node is defined as 
	class Node
	    {
	        int data;
	        Node next;
	        Node(int d) {data = d; next = null; }
	    }*/
	class GfG
	{
	 int detectLoop(Node head)
	  {
	   // Add code here
	   //Node node = head ;
	   
	   Node fast = head;
	   Node slow = head;
	   
	   while(slow!=null && fast!=null && fast.next!=null){
	       slow = slow.next;
	       fast = fast.next.next;
	       
	       if(slow == fast){
	           return 1;
	       }
	   }
	   
	   return 0;
	   
	    }
	}
}
