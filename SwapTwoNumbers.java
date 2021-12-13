package com.bl.examples;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number :");
        float first  = sc.nextFloat();
        System.out.print("Enter Second Number :");
        float second = sc.nextFloat();
        float one  = swapOne(first,second);
        System.out.println("**** AFTER SWAPPING ****");
        System.out.println("First Number  :" + one);
        float two  = swapTwo(first,second);
        System.out.println("Second Number :" + two);
    }
    static float swapOne(float first , float second){
        float temp = first;
        float one  = second;
        return  one;
    }
    static float swapTwo(float first , float second){
        float temp = first;
        float one  = second;
        float two  = temp;
        return  two;
    }


}
