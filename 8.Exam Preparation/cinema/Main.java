package com.softUni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        String offerType = scanner.nextLine();
        int noOfTickets = Integer.parseInt(scanner.nextLine());

        if (movieName.equals("John Wick")) {
            if (offerType.equals("Drink")) {
                double totalCost = noOfTickets * 12;
                System.out.printf("Your bill is %.2f$", totalCost);
            } else if (offerType.equals("Popcorn")) {
                double totalCost = noOfTickets * 15;
                System.out.printf("Your bill is %.2f$", totalCost);
            } else if (offerType.equals("Menu")) {
                double totalCost = noOfTickets * 19;
                System.out.printf("Your bill is %.2f$", totalCost);
            }
        } else if (movieName.equals("Star Wars")) {
            if (offerType.equals("Drink")) {
                if (noOfTickets >= 4) {
                    double totalCost = (noOfTickets * 18) * 0.7;
                    System.out.printf("Your bill is %.2f$", totalCost);
                } else {
                    double totalCost = noOfTickets * 18;
                    System.out.printf("Your bill is %.2f$", totalCost);
                }
            } else if (offerType.equals("Popcorn")) {
                if (noOfTickets >= 4) {
                    double totalCost = (noOfTickets * 25) * 0.7;
                    System.out.printf("Your bill is %.2f$", totalCost);
                } else {
                    double totalCost = noOfTickets * 25;
                    System.out.printf("Your bill is %.2f$", totalCost);
                }
            } else if (offerType.equals("Menu")) {
                if (noOfTickets >= 4) {
                    double totalCost = (noOfTickets * 30) * 0.7;
                    System.out.printf("Your bill is %.2f$", totalCost);
                } else {
                    double totalCost = noOfTickets * 30;
                    System.out.printf("Your bill is %.2f$", totalCost);
                }
            }
        } else if (movieName.equals("Jumanji")) {
            if (offerType.equals("Drink")) {
                if (noOfTickets == 2) {
                    double totalCost = (noOfTickets * 9) * 0.85;
                    System.out.printf("Your bill is %.2f$", totalCost);
                } else {
                    double totalCost = noOfTickets * 9;
                    System.out.printf("Your bill is %.2f$", totalCost);
                }
            } else if (offerType.equals("Popcorn")) {
                if (noOfTickets == 2) {
                    double totalCost = (noOfTickets * 11) * 0.85;
                    System.out.printf("Your bill is %.2f$", totalCost);
                } else {
                    double totalCost = noOfTickets * 11;
                    System.out.printf("Your bill is %.2f$", totalCost);
                }
            } else if (offerType.equals("Menu")) {
                if (noOfTickets == 2) {
                    double totalCost = (noOfTickets * 14) * 0.85;
                    System.out.printf("Your bill is %.2f$", totalCost);
                } else {
                    double totalCost = noOfTickets * 14;
                    System.out.printf("Your bill is %.2f$", totalCost);
                }
            }
        }
    }
}
