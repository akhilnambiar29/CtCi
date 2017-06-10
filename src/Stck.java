
public class Stck {
	
	Node top;
	
	public Object pop(){
		if(top!=null){
			int item = top.data;
			top = top.next;
			return item;
		}
		
		return null;
	}
	
	public void push(int item){
		Node t = new Node(item);
		t.next = top;
		top = t;
	}
	
	public Object peek(){
		return top.data;
	}
}
