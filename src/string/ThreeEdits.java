package string;

public class ThreeEdits {
	
	public boolean insert(String a,String b){
	char c = 0;
	int index = 0;
	boolean flag = false;
		for(int i = 0;i<a.length() && i<b.length();i++){
			if(a.charAt(i) != b.charAt(i)){
				c = a.charAt(i);
				index = i;
				flag = true;
				break;
			}
		}
		 if(index!=0 && index!=b.length()-1){
			 if(c != 0){
				b = b.substring(0,index) + c + b.substring(index,b.length());
			 }
//			 
		 }
		 else{
			 if(c == 0 && flag){
				 b = c + b;
			 }else {
				 
				 b = b + a.charAt(a.length()-1);
			 }
		 }
		 if(a.equals(b)){
			 return true;
		 }
		
		return false;
	}
	
	public boolean remove(String a,String b){
		
		return false;
	}
	
	public boolean replace(String a,String b){
		
		return false;
	}
	
	public static void main(String args[]){
		ThreeEdits te = new ThreeEdits();
		boolean ind =te.insert("preeti", "preet");
		if(ind){
			System.out.println("one edit away");
		}else{
			System.out.println("not possible");
		}
		
	}

}
