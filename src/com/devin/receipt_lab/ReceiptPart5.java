package com.devin.receipt_lab;
import java.util.Scanner;

class ReceiptPart5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double subTotal = 0;

        Item[] items = getItems();

        for (Item item : items) {
            System.out.print("How many " + item.commonName + "s would you like? ");
            item.setQuantity(input.nextInt());
            subTotal += item.getTotalPrice();
        }

        double taxRate = 0.05;
        double totalTax = subTotal * taxRate;
        double total = subTotal + totalTax;

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*     Miner's Hardware Store         *");
        System.out.println("*                                    *");
        for (Item item : items) {
            System.out.println(item.getItemForList());
        }
        System.out.println("*                                    *");
        System.out.println("**************************************");
        // Print more info
        System.out.println("*                                    *");
        System.out.println("*  QTY   ITEM         TOTAL          *");
        System.out.println("**************************************");
        // Item list
        for (Item item : items) {
            if (item.quantity > 0) {
                System.out.println(item);
            }
        }
        System.out.println("**************************************");
        // Totals
        System.out.println("*                                    *");
        System.out.println("*  SUBTOTAL           " + Utility.formatDouble(subTotal) + Utility.getSpaces(15 - Utility.formatDouble(subTotal).length()) + "*");
        System.out.println("*  TAX                " + Utility.formatDouble(totalTax) + Utility.getSpaces(15 - Utility.formatDouble(totalTax).length()) + "*");
        System.out.println("*  TOTAL              " + Utility.formatDouble(total) + Utility.getSpaces(15 - Utility.formatDouble(total).length()) + "*");
        System.out.println("*                                    *");
        System.out.println(Utility.randomMessage());
        System.out.println("*                                    *");
        System.out.println("**************************************");
    }

    private static Item[] getItems() {
        Item bolts = new Item(0.50,      "BOLTS        ", "Bolt");
        Item solderRoll = new Item(4.99, "SOLDER ROLL  ", "Solder Roll");
        Item lightBulb = new Item(9.99,  "LIGHT BULB   ", "Light Bulb");
        Item hammer = new Item(19.99,    "HAMMER       ", "Hammer");
        Item SDCard = new Item(14.99,    "SD CARD      ", "SD Card");
        Item AABattery = new Item(5.99,  "AA BATTERY   ", "AA Battery");
        Item superGlue = new Item(8.99,  "SUPER GLUE   ", "Super Glue");
        Item insulation = new Item(34.99,"INSULATION   ", "Insulation");

        return new Item[]{bolts, solderRoll, lightBulb, hammer, SDCard, AABattery, superGlue, insulation};
    }
}