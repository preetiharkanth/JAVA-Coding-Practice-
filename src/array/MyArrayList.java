package array;

import java.util.Arrays;

public class MyArrayList {
	
	//implement remove 
	//implement add
	//implement 
	//need to make everything final so that no one can manipulate the basic working
	private int size = 0;
	private static final int DEFAULT_SIZE = 10;
	private Object elements[];
	
	public MyArrayList() {
		elements = new Object[DEFAULT_SIZE ];
	}
	
	public void add(Object o){
		if(size == elements.length){
			increaseSize();
		}
		elements[size++] = o;
	}
	
	private void increaseSize(){
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements,newSize); 	 	
	}
	
	public Object get(int i){
		if(i >= size || i<0){
			throw new IndexOutOfBoundsException("Array out of bound");
		}
		Object o = elements[i];
		return o;
		
	}
	
	public Object remove(int i){
		if(i < size){
			Object o  = elements[i];
			elements[i] = null;
			int tempIndex = i;
			if(tempIndex < size ){
				elements[tempIndex] = elements[tempIndex +1];
				elements[tempIndex + 1] = null;
				tempIndex ++;
			}
			size --;
			return o;
		}else{
			throw new ArrayIndexOutOfBoundsException("Array out of bound");
		}
	}
	
}
