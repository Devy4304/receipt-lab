package com.devin.receipt_lab;

public class FoodItem {
    public final double pricePerItem;
    public int quantity = 0;
    public String receiptItemName;

    public FoodItem(double pricePerItem, String receiptItemName) {
        this.pricePerItem = pricePerItem;
        this.receiptItemName = receiptItemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return pricePerItem * quantity;
    }

    public static String formatDouble(double number) {
        return String.format("%.2f", number);
    }

    public String getTotalPriceFormatted() {
        return formatDouble(getTotalPrice());
    }

    public int getLengthOfTotalPriceFormatted() {
        return String.valueOf(getTotalPriceFormatted()).length();
    }

    public static String getSpaces(int numberOfSpaces) {
        return String.format("%" + numberOfSpaces + "s", "");
    }

    public String toString() {
        return "*  " + quantity + FoodItem.getSpaces(5 - String.valueOf(quantity).length()) + receiptItemName + getTotalPriceFormatted() + FoodItem.getSpaces(19 - getLengthOfTotalPriceFormatted()) + "*";
    }
}
