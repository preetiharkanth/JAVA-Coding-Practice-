package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicate {
	
	public static int [] readNumsFromCommandLine() {
		
		System.out.println("Enter length of array \n");
        Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        System.out.println("Enter values of array seperated by space \n");
       s.nextLine(); // throw away the newline.
        
        int [] numbers = new int[count];
        
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
	
	public static void duplicate(int[] arr){
		
		HashSet<Integer> arrSet = new HashSet<Integer>();
		for (int num : arr){
			if(!arrSet.add(num)){
				System.out.println("Duplicate is "+num);
			}
		}
		//return 0;
		
	}

	public static void main(String arges[]){
		
		int num[]  = readNumsFromCommandLine();
		for(int i = 0;i<num.length ; i++){
			System.out.println(num[i]);
		}
		duplicate (num);
		
	}
}
