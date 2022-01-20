package assignment;

import java.util.Arrays;

public class BubbleSort_8 {

	public static void main(String[] args) {
		
		//initialize array
		int arr[] = {32, 85, 96, 75, 88, 15, 24, 36, 12, 8, 10, 100, 21, 78, 67};
		int temp;
		System.out.println(Arrays.toString(arr));
		
		//bubble sort 
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = 0; j < arr.length - i - 1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array :");
		System.out.println(Arrays.toString(arr));
	}
}