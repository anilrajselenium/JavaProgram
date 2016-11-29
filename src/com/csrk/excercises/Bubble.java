package com.csrk.excercises;

public class Bubble {

	public static void main(String[] args) {

		int intArray[] = { 9, 2, 7, 5, 7, 9 };

		System.out.println("Array values before bubblesort");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		bubbleSort(intArray);

		System.out.println("Array values After bubblesort");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

	private static void bubbleSort(int[] intArray) {

		int n = intArray.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - 1); j++) {
				if (intArray[j - 1] > intArray[j]) {
					// swap
					temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;

				}

			}
		}

	}

}