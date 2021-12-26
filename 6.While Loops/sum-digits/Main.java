package com.softUni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num/= 10;
        }
        System.out.println(sum);
    }
}
