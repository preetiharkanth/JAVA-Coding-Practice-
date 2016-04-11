package queue;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Myqueue <T>{
	
	private static class MyQueueNode<T> {
		
		private T data;
		private MyQueueNode next;
		
		public MyQueueNode(T data){
			this.data = data;
		}
		
	}
	
	private MyQueueNode<T> first ;
	private MyQueueNode<T> last;
	
	public void add(T data){
		MyQueueNode<T> t = new MyQueueNode<T>(data);
		if(last != null){
			last.next = t;
		}
		last = t;
		if(first == null){
			first = t;
		}
		
		
	}
	
	public T remove(){
		if(first == null){
			throw new NoSuchElementException();
		}
		T data = first.data;
		first = first.next;
		if(first == null){
			last = null;
		}
		return data;
	}

	public T peek(){
		if(first == null){
			throw new EmptyStackException();
		}
		return first.data;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
}
