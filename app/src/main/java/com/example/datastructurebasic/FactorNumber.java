package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 02/03/22.
 * program to write factor of numbers
 *
 * output
 * enter int number: 60
 * 1 2 3 4 5 6 10 12 15 20 30 60
 */
public class FactorNumber {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter int number: ");
        int num = s.nextInt();

        // loop runs from 1 to 60
        for (int i = 1; i <= num; i++) {

            // if number is divided by i
            // i is the factor
            if (num % i == 0) {
                System.out.print(" "+i );
            }
        }

    }
}
