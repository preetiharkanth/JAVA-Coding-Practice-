package linkedList;


import java.util.Hashtable;
import java.util.*;
import java.util.LinkedList;



public class RemoveDuplicate {
	
	private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = next;
        }
    }
	
	
	public static void removeDup(Node head ){
		
		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		int count =0 ;
		Node prev = head;
		Node curNode = head.next;
		while(head != null){
			if(table.contains(head.data)){
				prev.next = head.next;
			}else{
				table.put(count,(Integer) head.data);
				prev = head;
			}
			head = head.next;
		}
		
		
		
	}
	
public static void main(String args[]){
	LinkedList<Integer> l = new LinkedList<Integer>();
	l.add(1);
	l.add(2);
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	
	Node  n = new Node(l.getFirst());
	removeDup(n);
	System.out.println(l);
	
}
	
	

}
