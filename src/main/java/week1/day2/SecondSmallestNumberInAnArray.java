package week1.day2;

import java.util.Arrays;

public class SecondSmallestNumberInAnArray {

	public static void main(String[] args) {

		int [] a= {21,10,11,91,94};
		Arrays.sort(a);
		System.out.println("The second smallest number is:" + a[1]);

	}

}
