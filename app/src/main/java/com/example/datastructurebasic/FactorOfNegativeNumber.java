package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 02/03/22.
 * program to print factor of negative number
 *
 * output
 * enter int number: -60
 * -60 -30 -20 -15 -12 -10 -6 -5 -4 -3 -2 -1 1 2 3 4 5 6 10 12 15 20 30 60
 */
public class FactorOfNegativeNumber {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter int number: ");
        int num = s.nextInt();
        //The Math.abs() method returns the absolute value of the number.
        for(int i = num; i <= Math.abs(num); i++){
            //// skips the iteration for i = 0
            if(i == 0){
                continue;
            }else{
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }

    }

}
