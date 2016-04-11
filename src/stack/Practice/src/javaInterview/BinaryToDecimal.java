package javaInterview;

public class BinaryToDecimal {
	public int convertBinaryToDecimal(int binary){
		int power = 0;
		int decimal = 0 ;
		int temp = 0;
		while(true){
			if(binary == 0){
				break;
			}else{
				temp = binary % 10;
				decimal += temp*Math.pow(2, power);
				binary = binary/10;
				power++;
			}
		}
			return decimal;
		}
	
	public static void main(String args[]){
		BinaryToDecimal bd = new BinaryToDecimal();
		int result = bd.convertBinaryToDecimal(100110);
		System.out.println(result);
	}
}
