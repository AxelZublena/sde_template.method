package com.hz;

public class Main {

    // READ THE INSTRUCTIONS IN THIS METHOD, PLEASE!!!
    public static void main(String[] args) {

        // Lets print some cards
        Printer printer = new Console();

        Card card = null;

        // new PostCard or new GraduationCard
        card = new PostCard(printer);
        card.print();
    }
}
