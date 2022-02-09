package com.hartmanmark.reverseapp;

import java.util.ArrayList;

public class Reverse {

    public String reverseString(String input) {
        verifyString(input);
        String[] arrayOfSplitWords = input.split(" ");
        return composeInvertedWords(arrayOfSplitWords);
    }

    private String verifyString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("null");
        } else if (input.isEmpty()) {
            throw new IllegalArgumentException("Empty String");
        } else if (input.trim().isEmpty()) {
            throw new IllegalArgumentException("White Space Only String");
        } else {
            return input;
        }
    }

    private String composeInvertedWords(String[] arrayOfSplitWords) {
        ArrayList<String> outputString = new ArrayList<String>();
        for (String i : arrayOfSplitWords) {
            char[] arrayOfLettersOfWord = new StringBuilder(i).toString().toCharArray();
            reverseArrayOfLetters(arrayOfLettersOfWord);
            String reverseWord = new String(arrayOfLettersOfWord);
            outputString.add(reverseWord);
        }
        return String.join(" ", outputString);
    }

    private void reverseArrayOfLetters(char str[]) {
        int i = str.length - 1;
        int j = 0;
        while (j < i) {
            if (!Character.isLetter(str[j])) {
                j++;
            } else if (!Character.isLetter(str[i])) {
                i--;
            } else {
                char tmp = str[j];
                str[j] = str[i];
                str[i] = tmp;
                j++;
                i--;
            }
        }
    }
}
