package com.devin.receipt_lab;

public class Item {
    public final double pricePerItem;
    public int quantity = 0;
    public String receiptItemName;

    public Item(double pricePerItem, String receiptItemName) {
        this.pricePerItem = pricePerItem;
        this.receiptItemName = receiptItemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return pricePerItem * quantity;
    }

    public String getTotalPriceFormatted() {
        return Utility.formatDouble(getTotalPrice());
    }

    public int getLengthOfTotalPriceFormatted() {
        return String.valueOf(getTotalPriceFormatted()).length();
    }

    public String toString() {
        return "*  " + quantity + Utility.getSpaces(6 - String.valueOf(quantity).length()) + receiptItemName + getTotalPriceFormatted() + Utility.getSpaces(18 - getLengthOfTotalPriceFormatted()) + "*";
    }
}
