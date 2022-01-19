package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class swap {
	public static final <T> void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private static void test() {
		String[] arr = { "I", "Work", "In", "Capgemini" };
		System.out.println("Original Array: " + Arrays.toString(arr));
		swap(arr, 0, 3);
		System.out.println("Swapped Array: " + Arrays.toString(arr));

	}

	public static void main(String... args) {
		test();
	}
}
