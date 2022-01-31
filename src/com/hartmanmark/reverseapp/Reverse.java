package com.hartmanmark.reverseapp;

import java.util.Scanner;

public class Reverse {

	public String scanner() {
		Scanner inputString = new Scanner(System.in);
		String inputWords = inputString.nextLine();
		inputString.close();
		return inputWords;
	}

	public String[] split() {
		String stringFromSystemIn = scanner();
		String[] splitWords = stringFromSystemIn.split(" ");
		return splitWords;
	}

	public void join() {
		String[] splitWords = split();
		System.out.print("Your reverse string: ");
		for (String word : splitWords) {
			String reverseWord = new StringBuilder(word).toString();
			char[] lettersArray = reverseWord.toCharArray();
			reverse(lettersArray);
			String outputWord = new String(lettersArray);
			System.out.print(outputWord + " ");
		}
	}

	public void reverse(char str[]) {
		int r = str.length - 1;
		int l = 0;
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
