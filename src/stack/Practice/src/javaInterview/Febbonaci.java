package javaInterview;

public class Febbonaci {
	public static void main(String args[]){
		int fibCount = 15;
		int[] fib = new int[fibCount];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<fibCount;i++){
			fib[i]=fib[i-2]+fib[i-1];
		}
		for(int j:fib){
			System.out.println(j);
		}
	}

}
