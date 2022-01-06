package week1.day2;

import java.util.Arrays;

public class secondLargestNumberInAnArray {

	public static void main(String[] args)
	{
		
		int [] a= {21,10,11,91,94};
		Arrays.sort(a);
		System.out.println("The second smallest number is:" + a[1]);
		System.out.println("The second largest number is:" + a[a.length-2]);
		
		
		
	}

} 

