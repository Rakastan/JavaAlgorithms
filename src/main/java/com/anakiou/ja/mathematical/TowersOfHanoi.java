package com.anakiou.ja.mathematical;


//Big O = O(2 raised to n)


public class TowersOfHanoi {
	
	private static int iter = 0;
	
	public static void main(String[] args){
		move(10, 1, 3);
		System.out.println("Completed in " + iter + " moves");
	}
	
	public static void move(int diskNo, int source, int target){
		
		if(diskNo == 0){
			return;
		}
		
		int middle = 6 - source - target;
		move(diskNo -1, source, middle);
		iter++;
		System.out.println("Moving " + diskNo + " from " + source + " to " + target);
		move(diskNo -1, middle, target);
	}

}
