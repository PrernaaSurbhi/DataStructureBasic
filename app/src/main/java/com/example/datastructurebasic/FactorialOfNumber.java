package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 28/02/22.
 * Program to find factorial of the number
 *
 * output
 * enter the number : 10
 * Factorial of 10 = 362880
 */

public class FactorialOfNumber {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = s.nextInt();
        int i = 1;
        long factorial = 1;

        while(i<num){
            factorial = factorial * i;
            i++;
        }
        System.out.printf("Factorial of %d = %d ",num,factorial);
    }

}
