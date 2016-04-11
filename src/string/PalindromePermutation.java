package string;

public class PalindromePermutation {
	
	public boolean findPalindromePermutaion(String str){
		
		int count = 0;
		char c;
		
		boolean oddUsed = false;
		char odd = 0 ;
		
		int len = str.length();
		for(int i = 0;i<str.length();i++){
			c= str.charAt(i);
			for(int j=0;j<len;j++){
				if(str.charAt(j) == c){
					count++;
				}
			}
			
			if(count % 2 == 1){
				if(oddUsed && odd != c){
					return false;
				}
				else{
					oddUsed = true;
					odd = c;
				}
			}
			
		}
		
		
		return true;
	}

	
	public static void main(String args[]){
		PalindromePermutation pp = new PalindromePermutation();
		boolean flag = pp.findPalindromePermutaion("aaaad");
		if(flag){
			System.out.println("Permuation of Palindrome");
		}else{
			System.out.println("Not permutaion of palindrome");
		}
		
	}
	
}
