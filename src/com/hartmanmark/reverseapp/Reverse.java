package com.hartmanmark.reverseapp;

import java.util.*;

public class Reverse {

	public String scanner() {
		Scanner newString = new Scanner(System.in);
		String enteredString = newString.nextLine();
		newString.close();
		return enteredString;
	}

	public String[] splittingStringIntoWords() {
		String stringFromSystemIn = scanner();
		String[] splitWords = stringFromSystemIn.split(" ");
		return splitWords;
	}

	public void printReverseWords(String[] splitWords) { 
		for (String i : splitWords) {
			String oneWord = new StringBuilder(i).toString();
			char[] arrayOfLettersOfWord = oneWord.toCharArray();
			reverse(arrayOfLettersOfWord);
			String reverseWord = new String(arrayOfLettersOfWord);
			String oneReverseWordToPrint = String.join(" ", reverseWord);
			System.out.print(oneReverseWordToPrint + " ");
		}
	}

	public void reverse(char str[]) {
		int r = str.length - 1;
		int l = 0;
		while (l < r) {
			if (!Character.isLetter(str[l])) {
				l++;
			} else if (!Character.isLetter(str[r])) {
				r--;
			} else {
				char tmp = str[l];
				str[l] = str[r];
				str[r] = tmp;
				l++;
				r--;
			}
		}
	}
}
