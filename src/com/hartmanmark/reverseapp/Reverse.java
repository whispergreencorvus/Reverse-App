package com.hartmanmark.reverseapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {

    public String redirect(String into) {
        List<String> arrayOfSplitWords = splitStringIntoWords(into);
        String stringToPrint = composingInvertedWords(arrayOfSplitWords);
        return stringToPrint;
    }

    private List<String> splitStringIntoWords(String input) {
        List<String> splitWords = Arrays.asList(input.split(" "));
        return splitWords;
    }

    private String composingInvertedWords(List<String> arrayOfSplitWords) {
        Reverse reverse = new Reverse();
        List<String> outputString = new ArrayList<String>();
        String[] myArray = new String[outputString.size()];
        for (String i : arrayOfSplitWords) {
            String oneWord = new StringBuilder(i).toString();
            char[] arrayOfLettersOfWord = oneWord.toCharArray();
            reverse.reversingArrayOfLerrers(arrayOfLettersOfWord);
            String reverseWord = new String(arrayOfLettersOfWord);
            outputString.add(reverseWord);
        }
        outputString.toArray(myArray);
        String bindedWords = String.join(" ", outputString);
        return bindedWords;
    }

    private void reversingArrayOfLerrers(char str[]) {
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