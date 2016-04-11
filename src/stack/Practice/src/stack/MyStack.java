package stack;

import java.util.EmptyStackException;

public class MyStack<T> {
	
public static class StackNode<T>{
	private T data;
	private StackNode<T> next;
	
	public StackNode(T data){
		this.data = data;
	}
	
}

private StackNode<T> top ;

public T pop(){
	if(top == null){
		throw new EmptyStackException();
	}
	T item = top.data;
	top = top.next;
	return item;
}

public void push(T data){
	
	StackNode<T> item = new StackNode<>(data);
	item.next = top;
	top = item;
}

public T peek (){
	if(top == null){
		throw new EmptyStackException();}
	
	return top.data;
	}

public boolean isEmpty(){
	return top == null;
}

}
