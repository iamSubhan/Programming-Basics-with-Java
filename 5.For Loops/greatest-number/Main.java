package com.softUni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > maxNum) {
                maxNum = num;
            }
        }
        System.out.println(maxNum);
    }
}
