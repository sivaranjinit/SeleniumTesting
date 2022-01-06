package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int n=14341;
	     int n1=n;
		int rem=0;
	     while(n>0) {
	     	rem  =(rem*10)+n%10;
	     	n=n/10;
	     }
			
			System.out.println(rem);
	if(rem==n1) {
			System.out.println("Palindrome number:");
		}
		else {
			System.out.println("it is not a Palindrome number:");
	}
}
			

	}

