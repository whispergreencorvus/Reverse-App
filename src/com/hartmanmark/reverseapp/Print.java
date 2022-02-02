package com.hartmanmark.reverseapp;

import java.util.ArrayList;
import java.util.List;

public class Print {
    public void printReverseWords(String[] splitWords) {
        Reverse reverse = new Reverse();
        List<String> outputString = new ArrayList<String>();
        String[] myArray = new String[outputString.size()];
        for (String i : splitWords) {
            String oneWord = new StringBuilder(i).toString();
            char[] arrayOfLettersOfWord = oneWord.toCharArray();
            reverse.reversingArrayOfLerrers(arrayOfLettersOfWord);
            String reverseWord = new String(arrayOfLettersOfWord);
            outputString.add(reverseWord);
        }
        outputString.toArray(myArray);
        String formattedString = outputString.toString() // Print array without brackets and commas
                .replace(",", "") // remove the commas
                .replace("[", "") // remove the right bracket
                .replace("]", "") // remove the left bracket
                .trim(); // remove trailing spaces from partially initialized arrays
        System.out.println(formattedString);
    }
}
