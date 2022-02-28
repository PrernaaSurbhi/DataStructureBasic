package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 28/02/22.
 * program to write fibnocci series of n number.
 *
 * output
 * enter 1st number: 0
 * enter 2nd number: 1
 * 0
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 21
 * 34 
 */
public class FibnocciSeries {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int num1 = s.nextInt();

        System.out.print("enter 2nd number: ");
        int num2 = s.nextInt();

        //we need to find fibnocci series of 10 number
        int n = 10;
        int i = 0;
        while(i< n){
            System.out.println(num1+" ");
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
            i++;
        }

    }
}
