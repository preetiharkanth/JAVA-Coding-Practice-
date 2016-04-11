package array;

import java.util.Scanner;

public class MiddleIndex {
	public static int [] readNumsFromCommandLine() {
		
		System.out.println("Enter length of array \n");
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        System.out.println("Enter values of array seperated by space \n");
       s.nextLine(); // throw away the newline.
        
        int [] numbers = new int[count];
        
        @SuppressWarnings("resource")
		Scanner numScanner = new Scanner(s.nextLine());
       
        for (int i = 0; i < count; i++) {
            if (numScanner.hasNextInt()) {
                numbers[i] = numScanner.nextInt();
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
        }

        return numbers;
    }

	public static int findMiddleIndex(int[] arr){
		int leftIndex = 0, rightIndex = arr.length - 1;
		long leftSum = 0, rightSum = 0;
		while(true){
			if(leftSum >  rightSum){
				rightSum +=  arr[rightIndex];
				rightIndex--;
			}else{
				leftSum += arr[leftIndex];
				leftIndex++;
			}
			if (leftIndex > rightIndex){
			if(leftSum == rightSum){
				break;
				
			}else{
				return -1;}
			
			}
			
		}
		return leftIndex;
	}
	
	public static void main(String args []){
		int [] num = readNumsFromCommandLine();
		int middleIndex = findMiddleIndex(num);
		System.out.println("Middle index is"+ middleIndex);
	}
}
