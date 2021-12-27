package weak1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input=153;
		int org_num=input;
		int sum=0,rem;
		while(input>0)
		{
			rem = input%10;
			sum=sum+(rem*rem*rem);
			input=input/10;
			
		}
		if(sum==org_num)
		{
			System.out.println("it is an armstrong number");
		}
		else {
			
			System.out.println("it is not an armstrong number");
		}

	}

}
