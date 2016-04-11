package array;

public class Solution {
	
	public static void main(String args[]){
		String num = "";
	}
	 public int solution(String S) {
		 
		int sum=0; 
		String path[] =  S.split("\n");
		String root = "";
		String apath = "";
		//String apath = "";
		int N = path.length;
		for(int i = 1;i<N;i++){
			
			if(path[i].startsWith("dir")){
				root = path[i];
				apath = root;
			}
			
			if(path[i].contains("dir") && path[i].contains(" ")){
				//apath = "";
				apath = apath+"/"+path[i].trim();
			}
			else if (path[i].contains(".jpeg")){
				apath = apath+"/"+path[i].trim();
			}
			if(apath.contains(".jpeg") && apath.contains("dir"))
				sum = sum + apath.length();
			}
			
		

		
	        System.out.println(S);
	        // write your code in 
	        return 0;
	    }
	
	
}
