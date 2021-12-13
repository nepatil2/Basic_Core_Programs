package com.bl.examples;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Harmonic Number : ");
        int h = sc.nextInt();
        double H = harmonicNumber(h);
        System.out.println("Harmonic Number is " + H);
    }
    static double harmonicNumber(int n){
        float h = 1;
        for (int i = 2; i <=n; i++){
            h += (float) 1/i;
        }
        return h;
    }
}
