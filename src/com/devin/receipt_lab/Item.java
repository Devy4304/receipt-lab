package com.devin.receipt_lab;

public class Item {
    public final double pricePerItem;
    public int quantity = 0;
    public String receiptItemName;
    public String commonName;

    public Item(double pricePerItem, String receiptItemName) {
        this.pricePerItem = pricePerItem;
        this.receiptItemName = receiptItemName;
    }

    public Item(double pricePerItem, String receiptItemName, String commonName) {
        this.pricePerItem = pricePerItem;
        this.receiptItemName = receiptItemName;
        this.commonName = commonName;
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

    public String getItemForList() {
        return "*     " + commonName + Utility.getChars(13 - commonName.length(), ".") + " $" + Utility.formatDouble(pricePerItem) + Utility.getSpaces(16 - Utility.formatDouble(pricePerItem).length()) + "*";
    }

    public String toString() {
        return "*  " + quantity + Utility.getSpaces(6 - String.valueOf(quantity).length()) + receiptItemName + getTotalPriceFormatted() + Utility.getSpaces(15 - getLengthOfTotalPriceFormatted()) + "*";
    }
}
