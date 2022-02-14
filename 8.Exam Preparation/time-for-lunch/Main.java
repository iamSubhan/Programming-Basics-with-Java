package com.softUni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String seriesName = scanner.nextLine();
        int durationOfEpisode = Integer.parseInt(scanner.nextLine());
        int durationOfBreak = Integer.parseInt(scanner.nextLine());

        double timeToEat = durationOfBreak / 8.0;
        double timeToRelax = durationOfBreak / 4.0;

        double timeLeft = durationOfBreak - timeToEat - timeToRelax;

        if (timeLeft < durationOfEpisode) {
            double freeTime = Math.ceil(durationOfEpisode - timeLeft);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName,freeTime);
        } else if (timeLeft >= durationOfEpisode) {
            double freeTime = Math.ceil(timeLeft - durationOfEpisode);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, freeTime);
        }

    }
}
