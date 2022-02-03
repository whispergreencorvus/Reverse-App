package com.hartmanmark.reverseapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your string: ");
        Scanner newString = new Scanner(System.in);
        String enteredString = newString.nextLine();
        newString.close();
        Reverse reverse = new Reverse();
        String[] arrayOfSplitWords = reverse.splitEnteredStringIntoWords(enteredString);
        System.out.print("Your reverse string: ");
        Print print = new Print();
        print.printReverseWords(arrayOfSplitWords);
    }
}
