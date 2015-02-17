package com.anakiou.ja.mathematical;


//Big O = O(log b) for gcd(a,b)

public class EuclidsGcd {
	
	private static int iter;
	
	public static void main(String[] args){
		
		int i = gcd(36, 112345678);
		
		System.out.println("Found after " + iter + " iterations: " + i);
	}
	
	
	public static int gcd(int a, int b){
		if(b == 0){
			return a;
		}
		iter++;
		return gcd(b, a % b);
	}
	
	

}
