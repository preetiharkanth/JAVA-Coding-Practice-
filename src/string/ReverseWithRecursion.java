package string;

public class ReverseWithRecursion {
	public static String reverseString(String str){
		String reverse = "";
		if(str.length() == 1){
			return str;
		}else{
			reverse += str.charAt(str.length() - 1) + reverseString(str.substring(0,str.length()-1));
			return reverse;
		}
	}
	
	public static void main(String args[]){
		String reverse = reverseString("Preeti");
		System.out.println(reverse);
	}

}
