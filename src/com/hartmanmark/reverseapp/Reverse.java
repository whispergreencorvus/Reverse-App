package com.hartmanmark.reverseapp;

public class Reverse {

    public String[] splitEnteredStringIntoWords(String input) {
        String stringFromSystemIn = input;
        String[] splitWords = stringFromSystemIn.split(" ");
        return splitWords;
    }

    public void reversingArrayOfLerrers(char str[]) {
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
