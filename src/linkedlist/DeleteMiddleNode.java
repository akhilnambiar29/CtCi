package linkedlist;

public class DeleteMiddleNode {
	/* class Node {
	   int data;
	    Node next;
	    Node(int d)  { data = d;  next = null; }
	}*/

	
	
	   Node Delete(Node head)
	   {
		   // This is method only submission.
	           // You only need to complete the method.
	           if(head==null){
	               return head;
	           }
	           Node node = head;
	           int i = 0;
	           while(node!=null){
	               i++;
	               node = node.next;
	           }
	           //System.out.println(i);
	           int j = 0;
	           if(i%2==0){
	                j = i/2;
	           }
	           else{
	               j = (i-1)/2;
	           }
	           //System.out.println(j);
	           node = head;
	           int k = 0;
	           while(node.next!=null){
	               if(j-1==k){
	                   node.next = node.next.next;
	                   break;
	               }
	               node = node.next;
	               k++;
	           }
	           
	           return head;
	   }
	
}
