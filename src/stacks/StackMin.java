package stacks;

import linkedlist.*;
public class StackMin {
	
	Node top;
	int min;
	
	public Object pop(){
		if(top!=null){
			int item = top.data;
			top = top.next;
			return item;
		}
		
		return null;
	}
	
	public void push(int item){
		if(item<min){
			min = item;
		}
		Node t = new Node(item);
		t.next = top;
		top = t;
	}
	
	public Object peek(){
		return top.data;
	}
	
	public Object min(){
		return min;
	}
}
