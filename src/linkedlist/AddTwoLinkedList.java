package linkedlist;

public class AddTwoLinkedList {
	/*The Node is defined as */
	class Node
	    {
	        int data;
	        Node next;
	        Node(int d) {data = d; next = null; }
	        Node(){}
	    }
	

	class GfG
	{
		Node addTwoLists(Node first, Node second)
		{
		   // Your code here
		   //asdfiahhdf
		   //System.out.println("Here");
		   String firstNumber = "";//line 80
		   while(first!=null){
		       firstNumber=first.data+firstNumber;
		       first = first.next;
		   }
		   String secondNumber = "";
		   while(second!=null){
		       secondNumber = second.data+secondNumber;
		       second = second.next;
		   }
		   
		  // System.out.println(firstNumber);
		  // System.out.println(secondNumber);
		   
		   /*StringBuilder input1 = new StringBuilder();
		   input1.append(firstNumber);
		   firstNumber = input1.reverse();
		   
		   StringBuilder input2 = new StringBuilder();
		   input2.append(secondNumber);
		   secondNumber = input2.reverse();
		   
		   */
		   double firstN = Double.parseDouble(firstNumber);
		   double secondN = Double.parseDouble(secondNumber);
		   
		   //System.out.println("first"+firstN);
		   //System.out.println("Second"+ secondN);
		  double sum = (firstN+secondN);
		   
		   //System.out.println(new java.math.BigDecimal(sum));
		   Node newNode = null;
		   newNode = new Node((int)sum%10);
		       sum = sum/10;
		       //System.out.println("Initial Sum" + sum);
		       Node head = newNode;
		   while(sum>0){
		       Node tempNode = new Node((int)sum%10);
		       newNode.next = tempNode;
		       //System.out.println("%" + sum%10);
		       sum = (int)sum/10;
		       newNode = tempNode;
		       
		       //System.out.println("newNode" + newNode.data);
		       //System.out.println("tempNOde" + tempNode.data);
		   }
		   /*while(head!=null){
		       System.out.println(head.data);
		       head = head.next;
		   }*/
		   return head;
		}
	}
}
