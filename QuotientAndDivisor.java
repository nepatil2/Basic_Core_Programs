package com.bl.examples;

import java.util.Scanner;

public class QuotientAndDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend Number :");
        int divident = sc.nextInt();
        System.out.print("Enter Divisor Number :");
        int divisor = sc.nextInt();
        float q = quotient(divident,divisor);
        System.out.println("Quotient :" + q);
        float r = remainder(divident,divisor);
        System.out.println("Remainder :" + r);

    }
    static int quotient(int divident, int divisor){
        int quotient = divident / divisor;
        return quotient;
    }
    static int remainder(int divident, int divisor){
        int remainder = divident % divisor;
        return remainder;
    }

}
