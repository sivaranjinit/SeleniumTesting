package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int i=2;
		boolean prime=true;
		int n=27;
		while(i<n) {
			if(n%i==0) {
				//System.out.println("it is not a prime number:");
				 prime=false;
			}
			i++;
		}
		if(prime==true) {
			System.out.println("the given number is prime:");
		}
		
		else {
			
			System.out.println("it is not a prime number:");
			
		}

	}

}
