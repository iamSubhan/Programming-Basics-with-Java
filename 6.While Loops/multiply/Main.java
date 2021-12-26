package com.softUni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (num > 0) {
            sum += num % 10; //To get the last digit
            num /= 10; //To remove the last digit
        }
        System.out.println(sum);
    }
}
