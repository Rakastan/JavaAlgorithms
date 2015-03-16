package com.anakiou.ja.arrays;

public class Amazon {
	/**
	 * Example 3: Print out the grade-school multiplication table up to 12x12
	 */
	public static void multTables(int max) {
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= max; j++) {
				System.out.printf("%4d", j * i);
			}
			System.out.println();
		}
	}

	/**
	 * Example 4: Write a function that sums up integers from a text file,
	 * one int per line.
	 */
	public static void sumFile(String name) {
		try {
			int total = 0;
			java.io.BufferedReader in = new java.io.BufferedReader(
					new java.io.FileReader(name));
			for (String s = in.readLine(); s != null; s = in.readLine()) {
				total += Integer.parseInt(s);
			}
			System.out.println(total);
			in.close();
		} catch (Exception xc) {
			xc.printStackTrace();
		}
	}

	/**
	 * Example 5: Write function to print the odd numbers from 1 to 99
	 */
	public static void printOdds() {
		for (int i = 1; i < 100; i += 2) {
			System.out.println(i);
		}
	}

	/**
	 * Example 6: Find the largest int value in an int array
	 */
	public static int largest(int[] input) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max)
				max = input[i];
		}
		return max;
	}

	/**
	 * Example 7: Format an RGB value (three 1-byte numbers) as a 6-digit
	 * hexadecimal string
	 */
	public String formatRGB(int r, int g, int b) {
		return (toHex(r) + toHex(g) + toHex(b)).toUpperCase();
	}

	public String toHex(int c) {
		String s = Integer.toHexString(c);
		return (s.length() == 1) ? "0" + s : s;
	}
}
