package com.anakiou.ja.bit;

import static java.lang.Math.*;

public class Binary {
	private static int countBits(int num) {
		int count = 0;
		for (int i = 0; i < 8; i++) {
			// num & 1 produces 1 => bitmask
			if ((num & 1) == 1) // check if rightmost bit is 1
				count++;
			num = (byte) (num >> 1); // shift right 1 bit, including sign bit
			/*
			 * >> arithmetic right shift (inserts sign bit)
			 * >>> logical right shift (inserts zeroes)
			 */
		}
		return count;
	}

	private static void Dec2Bin(int num) {
		/*
		 * negative => ignore negative sign
		 * 2's complement => invert all bits + 1
		 * not implemented
		 */
		if (num < 0)
			num *= -1;

		int[] binNum = new int[32];
		int i = 0;
		while (num > 0) {
			binNum[i++] = num & 1;
			num >>= 1;
		}
		i--;

		for (; i >= 0; --i)
			System.out.print(binNum[i]);
	}

	private static void recDec2Bin(int num) {
		int BASE = 2;
		if (num < 0)
			num *= -1;
		num = abs(num);
		if (num > 0) {
			recDec2Bin(num / BASE);
			System.out.print(num % BASE);
		}
	}

	public static void main(String[] args) {
		Dec2Bin(-41);
		System.out.println();

		recDec2Bin(-41);
		System.out.println();

		System.out.println(countBits(-41));
	}
}
