package com.softUni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int hallCapacity = Integer.parseInt(scanner.nextLine());
        int profit = 0;
        String input = scanner.nextLine();

        while (!input.equals("Movie time!")) {
            int peopleEntering = Integer.parseInt(input);
            if (hallCapacity - peopleEntering >= 0) {
                hallCapacity -= peopleEntering;
                profit += peopleEntering * 5;
                if (peopleEntering % 3 == 0) {
                    profit -= 5;
                    }
                } else {
                    System.out.println("The cinema is full.");
                    break;
                }
                input = scanner.nextLine();
            }

            if (input.equals("Movie time!")) {
                System.out.printf("There are %d seats left in the cinema.%n", hallCapacity);
            }
            System.out.printf("Cinema income - %d$", profit);
    }
}
