package com.devin.receipt_lab;

public class Utility {
    public static String formatDouble(double number) {
        return String.format("%.2f", number);
    }

    public static String getSpaces(int numberOfSpaces) {
        return String.format("%" + numberOfSpaces + "s", "");
    }
}