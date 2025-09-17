package com.devin.receipt_lab;
import java.util.Scanner;

class Receipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your High School's Name? ");
        HighSchool highSchool = new HighSchool(input.nextLine());

        // Account for different High School name lengths for the trailing spaces
        String highSchoolNameSpaces = String.format("%" + (21 - highSchool.getInitials().length()) + "s", "");

        Item drink = new Item(1.50, "DRINK     ");
        Item candy = new Item(1.25, "CANDY     ");
        Item hotDog = new Item(2.75, "HOT DOG   ");
        Item hamburger = new Item(3.50, "HAMBURGER ");

        System.out.print("How many drinks would you like? ");
        drink.setQuantity(input.nextInt());

        System.out.print("How many pieces of candy would you like? ");
        candy.setQuantity(input.nextInt());

        System.out.print("How many hot dogs would you like? ");
        hotDog.setQuantity(input.nextInt());

        System.out.print("How many hamburgers would you like? ");
        hamburger.setQuantity(input.nextInt());

        int orderNumber = (int) (Math.random() * 100 + 1);

        double subTotal = candy.getTotalPrice() + drink.getTotalPrice() + hotDog.getTotalPrice() + hamburger.getTotalPrice();
        double taxRate = 0.05;
        double totalTax = subTotal * taxRate;
        double total = subTotal + totalTax;

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*     " + highSchool.getInitials() + " Snack Bar" + highSchoolNameSpaces + "*");
        System.out.println("*                                    *");
        System.out.println("*     Drink ..........$" + Utility.formatDouble(drink.pricePerItem) + "          *");
        System.out.println("*     Candy ..........$" + Utility.formatDouble(candy.pricePerItem) + "          *");
        System.out.println("*     Hot Dog ........$" + Utility.formatDouble(hotDog.pricePerItem) + "          *");
        System.out.println("*     Hamburger ......$" + Utility.formatDouble(hamburger.pricePerItem) + "          *");
        System.out.println("*                                    *");
        System.out.println("**************************************");
        // Print more info
        System.out.println("*  Order Number " + orderNumber + ((orderNumber >= 10) ? ((orderNumber >= 100) ? "" : "  ") : "   ") + "                 *");
        System.out.println("*                                    *");
        System.out.println("*  QTY   ITEM      TOTAL             *");
        System.out.println("**************************************");
        // Item list
        System.out.println(drink);
        System.out.println(candy);
        System.out.println(hotDog);
        System.out.println(hamburger);
        System.out.println("**************************************");
        // Totals
        System.out.println("*  SUBTOTAL        " + Utility.formatDouble(subTotal) + Utility.getSpaces(18 - Utility.formatDouble(subTotal).length()) + "*");
        System.out.println("*  TAX             " + Utility.formatDouble(totalTax) + Utility.getSpaces(18 - Utility.formatDouble(totalTax).length()) + "*");
        System.out.println("*  TOTAL           " + Utility.formatDouble(total) + Utility.getSpaces(18 - Utility.formatDouble(total).length()) + "*");
        System.out.println("**************************************");
    }
}