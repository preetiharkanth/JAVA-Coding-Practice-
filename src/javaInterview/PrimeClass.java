package javaInterview;

public class PrimeClass {
	public boolean checkPrime(int n){
		for(int i=2;i<n/2;i++){
			if(n%i==0){	
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		PrimeClass pc = new PrimeClass();
		boolean flag = pc.checkPrime(9);
		if(flag){
			System.out.println("prime");
		}else{
			System.out.println("not prime");
		}
	}

}
