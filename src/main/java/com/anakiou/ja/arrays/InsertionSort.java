package com.anakiou.ja.arrays;

public class InsertionSort {

	public static void insertionSort(int[] theArray) {
		int arraySize = theArray.length;

		for (int i = 1; i < arraySize; i++) {
			int j = i;
			int toInsert = theArray[i];
			while ((j > 0) && (theArray[j - 1] > toInsert)) {
				theArray[j] = theArray[j - 1];
				j--;

			}
			theArray[j] = toInsert;

			System.out.println("\nArray[i] = " + theArray[i] + " Array[j] = " + theArray[j]
					+ " toInsert = " + toInsert + "\n");

		}

	}

	public static void main(String[] args) {
		int[] theArray = { 11, 22, 4, 1, 6, 2, 8, 3, 9, 11 };

		for (int i : theArray) {
			System.out.print(i + " ");
		}

		System.out.println();

		insertionSort(theArray);

		for (int i : theArray) {
			System.out.print(i + " ");
		}

		System.out.println();
	}

}
