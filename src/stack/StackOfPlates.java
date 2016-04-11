package stack;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

public class StackOfPlates {
	
private static int STACK_SIZE = 5;
 LinkedList<Stack<Integer>> stacks = new LinkedList<Stack<Integer>>();
 
 
 public void push(int item){
	 if(stacks.isEmpty() || stacks.getLast().size() == STACK_SIZE){
		 Stack<Integer> stack = new Stack<Integer>();
		 stack.push(item);
		 stacks.add(stack);
	 }else{
		 stacks.getLast().push(item);
	 }
 }
 
 
 public Integer pop(){
	 if(stacks.isEmpty()){
		 throw new EmptyStackException();
	 }
		 Stack<Integer> temp = stacks.getLast();
		 int num = temp.pop();
		 if(temp.isEmpty()){
			 stacks.removeLast();
		 }
		 return (Integer)num;
	 
 }
 
 

}
