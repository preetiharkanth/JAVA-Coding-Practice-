package array;

import java.util.HashSet;

import java.util.Set;



public class CommonElements {
	public static void findCommonElement(int[] arr,int[] arr2){
		Set<Integer> set1 = new HashSet<Integer>();
		
		for(int a:arr){
			
				set1.add(a);
			
		}
		for(int a2:arr2){
			if(!set1.add(a2)){
				System.out.println("duplicate element"+a2);
			}
		}
		

	}

	public static void main(String args[]){
		int[] a = {1,2,3,4,5};
		int[] b = {4,5,6,7,8};
		findCommonElement(a, b);
	}
}
