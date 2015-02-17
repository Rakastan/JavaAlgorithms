package com.anakiou.ja.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexs {

	public static void main(String[] args) {

		String longString = " Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234";
		String strangeString = " 1Z aaa **** *** {{{ {{ { ";

		// Word that is 2 to 20 characters length
		// [A-Za-z]{2,20} \\w{2,20}
		
		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		
		// zip code 5 digits long		
		regexChecker("\\s\\d{5}\\s", longString);
		
		//2 characters that start with C or A
		//A[KLRZ]|C[AOT]
		
		regexChecker("A[KLRZ]|C[AOT]", longString);
		
		
		//minimum {5,}
		// + 
		// . ^ * + ? {} [ ] \ | ()
		
		regexChecker("(\\{{1,})", strangeString);
		
		//  \\w [A-Za-z0-9_]
        //  \\W 
		// *
		
		regexChecker("\\w*", strangeString);
		
	}
	
	

	public static void regexChecker(String theRegex, String str2Check) {
		
		Pattern checkRegex = Pattern.compile(theRegex);
		
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		while(regexMatcher.find()){
			if(regexMatcher.group().length() != 0){
				System.out.println(regexMatcher.group().trim());
			}
			
			System.out.println("Start index: " + regexMatcher.start());
			System.out.println("End index: " + regexMatcher.end());
		}

	}
}
