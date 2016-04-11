package stack;

import stack.MyStack.StackNode;

public class GetMinimumFromStack<T> {
	
	
public static class StackNode{
	private int data;
	private StackNode next;
	
	public StackNode(int data){
		this.data = data;
	}
	
}

StackNode min;
StackNode top;


public void push(int data){
	StackNode item = new StackNode(data);
	StackNode minItem = new StackNode(data);
	if(top == null){
		top = item;
		min = minItem;
	}else{
		item = top;
		top.data = data;
		item.next = top;
		if(minItem.data < this.min.data){
			minItem.next = min;
			min = minItem;
			
		}
	}
	

	
}
public int pop(){
	if(top == null){
		return -1;
	}
	int topInt = top.data;
	if(min.data == top.data){
		min.data = min.next.data;
	}
	top = top.next;
	return topInt;
}

public boolean isEmpty(){
	return top == null;
}

public int getMin(){
	return min.data;
}

}
