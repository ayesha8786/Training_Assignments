package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch_7 {

	public static void main(String[] args) {

		// initialize array
		int arr[] = { 32, 85, 96, 75, 88, 15, 24, 36, 12, 8, 10, 100, 21, 78, 67 };

		// display array and user input
		System.out.println(Arrays.toString(arr));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to search in array : ");
		int num = scanner.nextInt();

		// array search
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println(num + " is in the array at " + i + "th index.");
			}
		}
	}
}
