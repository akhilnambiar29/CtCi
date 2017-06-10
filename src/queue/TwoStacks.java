package queue;

import java.util.Stack;

public class TwoStacks {

	public Stack<Integer> inbox = new Stack<Integer>();
	public Stack<Integer> outbox = new Stack<Integer>();
	
	public void queue(int item){
		inbox.push(item);
	}
	
	public int dequeue(){
		if(outbox.isEmpty()){
			while(!inbox.isEmpty()){
				outbox.push(inbox.pop());
			}
		}
		return outbox.pop();
	}
}
