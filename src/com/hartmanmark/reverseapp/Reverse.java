package com.hartmanmark.reverseapp;

import java.util.ArrayList;

public class Reverse {

    public String reverseString(String input) {
        String stringFromSystemIn = input;
        String[] arrayOfSplitWords = stringFromSystemIn.split(" ");
        String stringToPrint = compose(arrayOfSplitWords);
        return stringToPrint;
    }

    private String compose(String[] arrayOfSplitWords) {
        ArrayList<String> outputString = new ArrayList<String>();
        for (String i : arrayOfSplitWords) {
            String oneWord = new StringBuilder(i).toString();
            char[] arrayOfLettersOfWord = oneWord.toCharArray();
            reverse(arrayOfLettersOfWord);
            String reverseWord = new String(arrayOfLettersOfWord);
            outputString.add(reverseWord);
        }
        String bindedWords = String.join(" ", outputString);
        return bindedWords;
    }

    private void reverse(char str[]) {
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
