package array;

import java.util.TreeSet;

class RotateArray {

	public static void main(String args[]) {

		int A[] = { -1, 3, -4, 5, 1, -6, 2, 1 };
		//int k = solution(A);
	}

	public static int solution(int X) {
    	TreeSet<Integer> tree = new TreeSet<Integer>();
    	String num = new String(""+X); 
    	for(int i=0;i<num.length()-1;i++){ 
    		if(num.charAt(i)==num.charAt(i+1)){
    			System.out.println(num.substring(0,i)+num.substring(i+1));
    			tree.add(Integer.parseInt((num.substring(0,i)+num.substring(i+1)).toString()));
    		}
    	} 
    	return tree.last();
    	
       
       
       
       
       
       
       
   
}}