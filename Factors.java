package com.bl.examples;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find prime factors : ");
        int factor = sc.nextInt();
        int prime = prime(factor);
        System.out.println(prime(prime));

    }
    static int prime(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println("factors is : " + i);
                n = n / i;
            }
        }
        return n;
    }
}
