package com.anakiou.ja.arrays;

//Big O = O(n)

public class SequentialSearch {
	
	private static int iter = 0;
	
	public static void main(String[] args){

		int [] arrayA = {1,2,3,4,5,6,7,8,9,10,11,12,145,234,222};
		
		exists(arrayA, 3);
		System.out.println("Found after " + iter + " iterations");
		iter = 0;
		exists(arrayA, 13);
		System.out.println("Found after " + iter + " iterations");
		iter = 0;
		exists(arrayA, 19);
		System.out.println("Found after " + iter + " iterations");
		iter = 0;
		exists(arrayA, 145);
		System.out.println("Found after " + iter + " iterations");
		iter = 0;
		exists(arrayA, 223);
		System.out.println("Found after " + iter + " iterations");
	}
	
	
	public static boolean exists(int[] sourceArray, int key){		
		for(int i = 0; i < sourceArray.length; i++){
			iter++;
			if(sourceArray[i] == key ){
				System.out.println("Item " + key + " found at index " + i);
				return true;
			}
		}
		System.out.println("Item " + key + " not found!");
		return false;
	}

}
