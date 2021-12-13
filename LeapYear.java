package com.bl.examples;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year (4 digit) : ");
        int year = sc.nextInt();
        if (year % 400 == 0 ) {
            System.out.println("year is a leap year " + year);
        }
        else if (year % 100 == 0 ){
            System.out.println("year is not a leap year " + year);
        }
        else if (year % 4 == 0 ){
            System.out.println("year is a leap year " + year);
        }
        else
            System.out.println("year is not a leap year " + year);
    }


}
