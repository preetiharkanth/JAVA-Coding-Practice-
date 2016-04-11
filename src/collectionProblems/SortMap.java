package collectionProblems;
 	 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMap {
	
	public static void sortTheMap(HashMap<String,Integer> hashMap){
		Set<Entry<String,Integer>> setEntry = hashMap.entrySet();
		List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(setEntry);
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>()
				{
						public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2){
							return (o2.getValue().compareTo(o1.getValue()));
						}
				}
				
				);
		for(Map.Entry<String, Integer> entry :list){
			System.out.println(entry.getKey()+"------"+entry.getValue());
		}
	}
	
	public static void main(String args[]){
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Preeti", 26);
		hm.put("Ayesha", 23);
		hm.put("Nikhil", 28);
		hm.put("Sunakshi", 25);
		sortTheMap(hm);
	}
	
	

}
