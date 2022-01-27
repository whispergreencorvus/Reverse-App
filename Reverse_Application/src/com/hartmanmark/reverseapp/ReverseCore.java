package com.hartmanmark.reverseapp;

import java.util.Scanner;

public class ReverseCore {

	public static String scanString(String splitWords) {
		Scanner inputString = new Scanner(System.in);
		System.out.println("Enter your words: ");
		String inputWords = inputString.nextLine();
		inputString.close();
		return inputWords;
	}

	public static void splitAndJoin(String input) {
 
		String stringFromSystemIn = scanString(input);
		String[] splitWords = stringFromSystemIn.split(" ");

		for (String word : splitWords) {

			String reverseWord = new StringBuilder(word).toString();
			char[] lettersArray = reverseWord.toCharArray();
			reverse(lettersArray);
			String outpuWord = new String(lettersArray);

			System.out.print(outpuWord + " ");
		}

	}

	public static void reverse(char str[]) {

		int r = str.length - 1, l = 0;
		while (l < r) {
			if (!Character.isLetter(str[l]))
				l++;
			else if (!Character.isLetter(str[r]))
				r--;
			else {
				char tmp = str[l];
				str[l] = str[r];
				str[r] = tmp;
				l++;
				r--;
			}
		}
	}

}
