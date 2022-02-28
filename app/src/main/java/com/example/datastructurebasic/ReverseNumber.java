package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 28/02/22.
 * program to reverse the number
 *
 * output
 * enter int number: 1273
 * reverse number is :3721
 */
public class ReverseNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter int number: ");
        int num = s.nextInt();
        int reverse = 0;

        while(num != 0){
            //getting the last digit from number
            int digit = num % 10;

            reverse = reverse * 10 +digit;

            //remove the last digit from num
            num = num / 10;
        }
        System.out.println("reverse number is :"+reverse);
    }
}
