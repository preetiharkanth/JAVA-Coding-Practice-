package array;

public class MaxTwoNumber {
	public static void findMaxTwoNumbers(int[] arr){
		int maxOne = 0;
		int maxTwo = 0;
		for(int num :arr){
			if(maxOne < num){
				maxTwo = maxOne;
				maxOne = num;
			}else if(maxTwo < num){
				maxTwo = num;
			}
		}
		System.out.println("1st Max number is "+maxOne+" and sesond is "+maxTwo);
	}
	
	public static void main(String args[]){
		int[] arr = {1,3,5,1,4,76,24,74,22,67,74,100,-4};
		findMaxTwoNumbers(arr);
	}

}
