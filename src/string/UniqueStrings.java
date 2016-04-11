package string;

public class UniqueStrings {
	public void findIfUnique(String str){
		boolean[] chars = new boolean[26];
		String uStr = str.toUpperCase();
		int len = uStr.length();
		for(int i = 0;i<len;i++){
		 char c = uStr.charAt(i);
		 if('A' <= c && c <= 'Z'){
			 if(chars[(int)c - 'A']){
				 System.out.println("Not unique");
				 return;
			 }
		 }		 
		 chars[(int)c - 'A'] = true;
		}
		System.out.println("Unique");
	}
	
	public static void main(String args[]){
		UniqueStrings us = new UniqueStrings();
		us.findIfUnique("Preti");
	}
}
