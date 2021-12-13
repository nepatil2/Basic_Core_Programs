package com.bl.examples;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter power Value :");
        int power = sc.nextInt();
        for (int i = 0 ; i <= power; i++){
            double p = 2;
            int pow = (int) Math.pow(p,i);
            System.out.println(pow);
        }
    }

}
