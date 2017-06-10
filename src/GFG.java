 /*Node of a linked list*/
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
/* Linked List class
class LinkedList
{
    Node head;  // head of list
}
This is method only submission.  You only need to complete the method. */
class GFG
{
	int intersectPoint(Node headA, Node headB)
	{
         // code here
          Node node = headA;
          int countA = 0;
        while(node!=null){
            countA++;
            node = node.next;
        }
        
        int countB = 0;
        node = headB;
        while(node!=null){
            countB++;
            node = node.next;
            System.out.println(node.data);
        }
        
        Node nodeA,nodeB;
        int diff = Math.abs(countA-countB);
        if(countA>countB){
            nodeA = headA;
            nodeB = headB;
        }
        else{
            nodeA = headB;
            nodeB = headA;
        }
        
        while(diff>0){
            nodeA = nodeA.next;
            diff--;
        }
        
        if(nodeA==null){
            return -1;
        }
        
        if(nodeA.data == nodeB.data){
            return nodeA.data;
        }
        else{
            return -1;
        }
        
        
	}
}
