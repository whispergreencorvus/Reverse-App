package com.hartmanmark.reverseapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your string: ");
        Scanner scanner = new Scanner(System.in);
        String enteredString = scanner.nextLine();
        scanner.close();
        Reverse reverse = new Reverse();
        String reversedString = reverse.reverseString(enteredString);
        System.out.print("Your reversed string: ");
        System.out.print(reversedString);
    }
}
