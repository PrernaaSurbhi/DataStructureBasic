package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 28/02/22.
 * Program to count number of digit
 *
 * output
 * enter int number: 1839494
 * number count is :7
 */
public class CountDigitInInteger {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter int number: ");
        int num = s.nextInt();

        int count = 0;

        while(num != 0){
            num = num/10;
            count++;
        }
        System.out.println("number count is :"+count);

    }
}
