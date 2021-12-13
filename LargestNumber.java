package com.bl.examples;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int first = sc.nextInt();
        System.out.print("Enter Second Number :");
        int second = sc.nextInt();
        System.out.print("Enter Third Number :");
        int third = sc.nextInt();

        if(first >= second && first >= third){
            System.out.println("First Number is Largest " + first);
        }
        else if (second >= first && second >= third){
            System.out.println("Second Number is Largest " + second);
        }
        else
            System.out.println("Third Number is Largest " + third);
    }
}
