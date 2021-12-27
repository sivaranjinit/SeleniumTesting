package week1.day2;

public class AgeCalculator {

	public static void main(String[] args) {
		int age=32;
		age=60;
		if(age>1 && age<18) {
			System.out.println("child");
		}
		else if(age>18 && age<25) {
			System.out.println("teen");
		}
		else if(age>25 && age<50) {
			System.out.println("middle");
		}
		else if(age>50) {
			System.out.println("senior");
		}
			
		}
	}


