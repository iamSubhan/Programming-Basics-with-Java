package com.softUni;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        int noOfSeasons = Integer.parseInt(scanner.nextLine());
        int noOfEpisodes = Integer.parseInt(scanner.nextLine());
        double duration = Double.parseDouble(scanner.nextLine());

        int specialEpisodeMins = 10 * noOfSeasons;
        double includeAds = duration * 1.2;
        double totalRuntime =((includeAds * noOfEpisodes) * noOfSeasons) + specialEpisodeMins;
        int finalRuntime = (int) Math.round(totalRuntime);

        System.out.printf("Total time needed to watch the %s series is %d minutes.",title,finalRuntime);
    }
}
