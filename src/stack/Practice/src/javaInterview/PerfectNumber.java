package javaInterview;

import java.util.ArrayList;

public class PerfectNumber {	
	
	public static void findPerfectNumber(int number){
		int temp = 0;
        for(int i=1;i<=number/2;i++){
            if(number%i == 0){
                temp += i;
            }
        }
        if(temp == number){
            System.out.println("It is a perfect number");
        } else {
            System.out.println("It is not a perfect number");
        }
	}
	
	public static void main(String args[])
	{
		findPerfectNumber(6);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		
	}
}
