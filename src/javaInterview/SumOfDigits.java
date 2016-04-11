package javaInterview;

public class SumOfDigits {
	int sum =0;
	public int findSum(int num){
		
		if(num == 0){
			return sum;
		}else{
		sum = sum + (num%10);
		findSum(num/10);
		}	
		return sum;
	}
	
	public static void main(String args[]){
		SumOfDigits sd = new SumOfDigits();
		int numSum = sd.findSum(12345);
		System.out.println("sum is"+numSum);
	}

}
