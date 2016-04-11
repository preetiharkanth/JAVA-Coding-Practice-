package javaInterview;

public class DecimalToBinary {
	public static void convertToBinary(int num){
		int[] bin = new int[25];
		int i;
		for( i=0;num > 0;i++){
			bin[i] = num%2;
			num = num/2;
		}
		for(int j=i;j>=0;j-- ){
			System.out.println(bin[j]);
		}
	}


public static void main(String args[]){
	convertToBinary(25);
}
}