package com.anakiou.ja.arrays;

//Time complexity O(log(n))
//Space complexity O(1)

public class BinarySearch {
	
	private static int iter;

	public static void main(String[] args) {
		int [] arrayA = new int [100000000];
		
		for(int i = 0; i < 100000000;i++){
			arrayA[i] = i;
		}
		
		exists(arrayA, 1);
		System.out.println("Found after " + iter + " operations");

	}

	public static boolean exists(int[] sourceArray, int key) {
		if (sourceArray.length == 0) {
			return false;
		}

		int start = 0;
		int end = sourceArray.length - 1;

		while (start <= end) {
			int middle = (start + end) / 2;
			if (key > sourceArray[middle]) {
				iter++;
				start = middle + 1;
			} else if (key < sourceArray[middle]) {
				iter++;
				end = middle - 1;
			} else {
				System.out.println("Item " + key + " found at index " + middle);
				return true;
			}
		}
		System.out.println("Item " + key + " not found");
		return false;
	}

}
