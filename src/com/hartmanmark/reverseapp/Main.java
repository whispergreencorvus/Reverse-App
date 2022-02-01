package com.hartmanmark.reverseapp;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your string: ");
        Reverse reverse = new Reverse();
        String[] arrayOfSplitWords = reverse.splittingStringIntoWords();
        System.out.print("Your reverse string: ");
        reverse.printReverseWords(arrayOfSplitWords);
    }
}
