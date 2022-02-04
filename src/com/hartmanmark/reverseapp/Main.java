package com.hartmanmark.reverseapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your string: ");
        Scanner scanner = new Scanner(System.in);
        String enteredString = scanner.nextLine();
        scanner.close();
        System.out.print("Your reverse string: ");
        Reverse reverse = new Reverse();
        String reversedString = reverse.redirect(enteredString);
        Print print = new Print();
        print.print(reversedString);
    }
}