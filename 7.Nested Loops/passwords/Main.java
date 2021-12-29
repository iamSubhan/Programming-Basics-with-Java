package com.softUni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= n; i+=2) {
            for (int j = 1; j <= n; j+=2) {
                System.out.printf("%d%d%d ",i,j,(i*j));
            }
            System.out.println();
        }
    }
}
