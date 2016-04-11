package string;

import java.util.Arrays;

public class CheckPermutation {

	public boolean checkPermutation(String a,String b){
		char [] arr = a.toCharArray();
		char [] brr = b.toCharArray();
		
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		
		
		return Arrays.equals(arr,brr);
		
	}
	
	public static void main(String args[]){
		CheckPermutation cp = new CheckPermutation();
		boolean i = cp.checkPermutation("preeti", "reetip");
		System.out.println(i);
	}
}
