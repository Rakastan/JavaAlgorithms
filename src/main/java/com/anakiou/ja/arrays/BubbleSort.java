package com.anakiou.ja.arrays;

public class BubbleSort {
	
	
	private static void bubbleSort(int[] theArray){
		int arraySize = theArray.length;
				
		for(int i = arraySize - 1; i > 1; i--){
			
			for(int j = 0; j < i; j++){
				
				// To change sort to Descending change to <
				
				if(theArray[j] > theArray[j + 1]){
					
					swapValues(j, j+1, theArray);					
				}
				
			}
			
		}	
	}
	
	private static void swapValues(int indexOne, int indexTwo, int[] theArray){
		
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
		
	}
	

	public static void main(String[] args) {
		int[] theArray  = {11,22,4,1,6,2,8,3,9,11};
		
		for(int i : theArray){
			System.out.print(i + " ");
		}
		
		System.out.println();

		bubbleSort(theArray);
		
		for(int i : theArray){
			System.out.print(i + " ");
		}
		
		System.out.println();
	}

}
