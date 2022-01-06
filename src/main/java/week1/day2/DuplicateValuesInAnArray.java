package week1.day2;

import java.util.Iterator;

public class DuplicateValuesInAnArray {

	public static void main(String[] args) {
	int[] arr1= {12,23,34,54,33,76};
	int[] arr2= {12,43,54,76,88,55};
	int[] arr3;
	for (int i=0;i<arr1.length;i++)
	{
		for(int j=0;j<arr2.length;j++)
		//for(int j=0;j<6;j++)
		{
			if(arr1[i]==arr2[j])
			{
				System.err.println("print the dupliate values:" +arr1[i]);
			}
		}
	}
	

	}

}
