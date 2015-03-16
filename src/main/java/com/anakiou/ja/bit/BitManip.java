package com.anakiou.ja.bit;

/**
	6. Setting the nth bit
	a | (1<<n)
7. Unsetting the nth bit
	a & ~(1<<n)
8. Toggling the nth bit
	a ^ (1<<n)
9. Unsetting the rightmost 1-bit
	a & (a-1)
*/
public class BitManip {
private static boolean isEven(int a) {
	return (a & 1) == 0;	// equivalent to isBitSet(a, 0)
}

private static boolean isNegative(int a) {
	return (a >> 31) != 0;
}

private static boolean isBitSet(int a, int n) {
	return (a & (1 << n)) != 0;
}

private static boolean isPowerOfTwo(int a) {
	return (a & (a-1)) == 0;
}

public static void main(String[] args) {
	// Two's complement
	int num = 4;
	int neg = ~num + 1;
	
	System.out.printf("Negative number = %d\n", neg);
}
}
