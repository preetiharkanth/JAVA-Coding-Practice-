package string;

import java.util.HashMap;
import java.util.Set;

import array.FindDuplicate;

public class DuplicateCharacters {

	public static void findDuplicateCharacters(String str){
		HashMap<Character,Integer> dupMap = new HashMap<Character,Integer>();
		char[] chr = str.toCharArray();
		for(char ch : chr){
			if(dupMap.containsKey(ch)){
				dupMap.put(ch, dupMap.get(ch)+1);
			}else{
				dupMap.put(ch,1);
			}
		}
		
		Set<Character> set = dupMap.keySet();
		for(Character ch : set){
			if(dupMap.get(ch) > 1){
				System.out.println("Character "+ch+" has "+dupMap.get(ch)+" occurance");
			}
		}
	}
	
	public static void main(String args[]){
		findDuplicateCharacters("Preeti");
	}
}
