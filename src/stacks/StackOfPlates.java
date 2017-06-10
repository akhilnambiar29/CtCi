package stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import linkedlist.*;
public class StackOfPlates {

	//int data;
	int capacity;
	Node top;
	int count;
	
	List<Stack<Integer>> list = new ArrayList<Stack<Integer>>();
	Stack<Integer> stack = new Stack<Integer>();
	public StackOfPlates(int capacity){
		//this.data = data;
		this.capacity = capacity;
	}
	
	public void push(int item){
		
		if(stack.size()>=capacity){
			list.add(stack);
			count++;
			stack = new Stack<Integer>();
			stack.push(item);
		}
		else{
			stack.push(item);
		}
		
	}
	
	public int pop(){
		if(stack.isEmpty()){
			stack = list.get(--count);
			return stack.pop();
		}
		else{
			return stack.pop();
		}
		
	}
	
	public void println(){
		for(Stack<Integer> stack:list){
			for(int i:stack){
				System.out.println("println : "+i);
			}
		}
		for(int i:stack){
			System.out.println("println : "+i);
		}
	}
	
	public int popAt(int index){
		return list.get(index/capacity).remove(index%capacity);
	}
	
	 public static void main(String[] args) {
		 	StackOfPlates setOfStacks = new StackOfPlates(4);
	        setOfStacks.push(1); setOfStacks.push(2); setOfStacks.push(3);
	        setOfStacks.push(4); setOfStacks.push(5); setOfStacks.push(6);
	        setOfStacks.push(7); setOfStacks.push(8); setOfStacks.push(9);
	        setOfStacks.println();
	        //println();
	        System.out.println("popAt "+setOfStacks.popAt(1));
	        System.out.println("popAt "+setOfStacks.popAt(0));
	        setOfStacks.println();
	        
	        System.out.println("pop "+setOfStacks.pop());
	        System.out.println("pop "+setOfStacks.pop());
	        System.out.println("pop "+setOfStacks.pop());
	        
	        System.out.println();
	}
}
