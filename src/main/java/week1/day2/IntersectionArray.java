package week1.day2;

public class IntersectionArray {

	public static void main(String[] args) {
		
		int[] arr1= {10,32,9,24,66};
		int[] arr2= {9,24,65,70,90};
		//int arr3[3];
		//int k=0;
	
		for (int i=0;i<arr1.length-1;i++)
		{
			for(int j=0;j<arr2.length-1;j++)
			
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr2[j]);
				}
			}
		}
	}
}

