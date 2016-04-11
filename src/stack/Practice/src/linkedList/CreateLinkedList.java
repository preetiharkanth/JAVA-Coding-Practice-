package linkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;



public class CreateLinkedList<T> implements Iterable<T>{
	
	private Node first ;
	private Node last;
	private static int N = 0;
	
	public CreateLinkedList(){
		first = null;
		last = null;
		N = 0;
	}
	
	public void add(T data){
		 if (data == null) { throw new NullPointerException("The first argument for addLast() is null."); }
		 if(!isEmpty()){
			 Node prev = last;
			 last = new Node(data,null);
			 prev.next = last;
			 
		 }else{
			 first = new Node(data,null);
		 }
	}
	
	public boolean remove(T data ){
		if(isEmpty()){
			throw new NoSuchElementException("dat cannot be removed from empty linked list");
		}
		boolean result = false;
		Node curr = first;
		Node prev = first;
		while(curr.next != null || curr == last){
			if(curr.data.equals(data)){
				if(N == 1){
					first = null;
					last = null;
				}else if(curr.equals(first)){
					first = first.next;
				}else if(curr.equals(last)){
					last = prev;
					last.next = null;
				}else {
					prev.next = curr.next;
				}
				N -- ;
				result = true;
				break;
				
			}
			prev = curr;
			curr = prev.next;
		}
		return result;
	}
	
	public int size(){
		return N;
	}
	
	public boolean isEmpty(){
		return N == 0;
	}

	@Override
	public Iterator iterator() {
		
		return new CreateLinkedListIterator();
	}
	
	private class CreateLinkedListIterator implements Iterator<T>{
			Node current = first;
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			if(!hasNext()){
				throw new NoSuchElementException();
			}
			T item = current.data;
			current = current.next;
			return item;
		}
		
	}
	
	private class Node {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
	
}
