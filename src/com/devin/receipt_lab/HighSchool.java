package com.devin.receipt_lab;

public class HighSchool {
    private final String name;

    public HighSchool(String name) {
        this.name = name;
    }

    public String getInitials() {
        String[] words = name.split(" ");
        StringBuilder initials = new StringBuilder(); // IntelliJ suggested this
        for (String word : words) {
            if (!word.isEmpty()) {
                initials.append(word.charAt(0));
            }
        }
        return initials.toString().toUpperCase();
    }
}
