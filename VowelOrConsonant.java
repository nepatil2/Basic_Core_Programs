package com.bl.examples;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Character :");
        char ch = sc.next().charAt(0);

        if ( ch == 'a' || ch == 'e' || ch  == 'i' || ch  == 'o' || ch == 'u') {
            System.out.println("Character is vowel ");
        }
        else if ( ch == 'A' || ch == 'E' || ch  == 'I' || ch  == 'O' || ch == 'U'){
            System.out.println("Character is vowel ");
        }
        else
            System.out.println("Character is consonent ");
    }
}
