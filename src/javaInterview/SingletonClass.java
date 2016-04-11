package javaInterview;

public class SingletonClass {
	private static SingletonClass myObjSnglton;
	
	static {
		myObjSnglton = new SingletonClass();
	}
	
	public static SingletonClass getSingleInstance(){
		return myObjSnglton;
	}
	
	public void testSingle(){
		
		System.out.println("My singleton works!! Hurrey!!");
	}
	
	public static void main(String args[]){
		SingletonClass sc = getSingleInstance();
		sc.testSingle();
	}
}
