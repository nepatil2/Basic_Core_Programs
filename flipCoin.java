package com.bl.examples;

import java.util.Scanner;

public class flipCoin {
    public static void main(String[] args) {
        int tail = 0;
        int head = 0;
        for(int i = 1 ; i <= 10 ; i++ ){
            double coin = (Math.random()*10)%1;
            if(coin < 0.5){
                tail++;
                System.out.println("Tails" + tail);
                int percent = (tail*100)/10;
                System.out.println("Tail percentage " + percent);
            }
            else if (coin > 0.5){
                head++;
                System.out.println("Head" + head);
                int percent = (head*100)/10;
                System.out.println("Head percentage " + percent);
            }
        }
    }
}
