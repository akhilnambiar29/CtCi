package stacks;



 class Node {
	public Node next;
	public int data;
	
	public Node(int item){
		data = item;
	}
}
public class SortStack {

	Node top;
	
	public Object pop(){
		if(top!=null){
			//System.out.println("First");
			int item = top.data;
			top = top.next;
			return item;
		}
		
		return null;
	}
	
	public void push(int item){
		if(top==null){
			Node t = new Node(item);
			top = t;
		}
		else{
			Node t = new Node(item);
			if(top.data>item){ // good 
				//System.out.println("Less "+item );
				t.next = top;
				top = t;
				return;
			}
			Node temp = top;
			//
			while(temp.next!=null){
				if(temp.next.data<item){
					temp = temp.next;
				}
				else{
					break;
				}
			}
			//System.out.println("tempdata"+temp.data+ "item"+item);
			Node node = temp;
			t.next = temp.next;
			node.next = t;
			
			
			
		}
		
		
		//top = t;
	}
	
	public static void main(String args[]){
		SortStack stack = new SortStack();
		stack.push(5);
		stack.push(9);
		stack.push(8);
		stack.push(3);
		stack.push(1);
		stack.push(4);
		
		System.out.println("Pop"+stack.pop());
		System.out.println("Pop"+stack.pop());
		System.out.println("Pop"+stack.pop());
		System.out.println("Pop"+stack.pop());
		System.out.println("Pop"+stack.pop());
		System.out.println("Pop"+stack.pop());
	}
	
	public Object peek(){
		return top.data;
	}
}
