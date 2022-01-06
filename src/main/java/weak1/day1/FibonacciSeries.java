package weak1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		int num,i;
		for (i=1; i<=8; i++)
		{
			num = num1+ num2;
			num1=num2;
			num2=num;
	       System.out.println(num);
		}
		
			
	}
}