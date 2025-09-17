package com.devin.receipt_lab;

public class Utility {

    private static final String[] messages = {
            "*  HAVE AN AMAZING DAY!              *",
            "*  WE HOPE YOU ENJOY YOUR PURCHASE!  *",
            "*  10% OFF ALL GARDEN HOSES, SUNDAY! *",
            "*  JOIN OUR MEMBERS PROGRAM!         *",
            "*  CHECK OUT OUR HAMMER SELECTION    *",
    };

    public static String formatDouble(double number) {
        return String.format("%.2f", number);
    }

    public static String getSpaces(int numberOfSpaces) {
        return " ".repeat(numberOfSpaces);
    }

    public static String getChars(int numberOfChars, String Character) {
        return Character.repeat(numberOfChars);
    }

    public static String randomMessage() {
        return messages[(int) (Math.random() * 5)];
    }
}