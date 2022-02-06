package com.hartmanmark.reverseapp;

import java.util.ArrayList;

public class Reverse {

    public String reverseString(String input) {
        String stringFromSystemIn = input;
        String[] arrayOfSplitWords = stringFromSystemIn.split(" ");
        String stringToPrint = composeInvertedWords(arrayOfSplitWords);
        return stringToPrint;
    }

    private String composeInvertedWords(String[] arrayOfSplitWords) {
        ArrayList<String> outputString = new ArrayList<String>();
        for (String i : arrayOfSplitWords) {
            String oneWord = new StringBuilder(i).toString();
            char[] arrayOfLettersOfWord = oneWord.toCharArray();
            reversingArrayOfLetters(arrayOfLettersOfWord);
            String reverseWord = new String(arrayOfLettersOfWord);
            outputString.add(reverseWord);
        }
        String bindedWords = String.join(" ", outputString);
        return bindedWords;
    }

    private void reversingArrayOfLetters(char str[]) {
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
