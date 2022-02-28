package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 28/02/22.
 * Program to find highest between 3 number
 *
 * output
 * enter 1st number: 20
 * enter 2nd number: 49
 * enter 3rd number: 30
 * num2 is highest number
 */
public class LargestBetween3Number {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int num1 = s.nextInt();

        System.out.print("enter 2nd number: ");
        int num2 = s.nextInt();

        System.out.print("enter 3rd number: ");
        int num3 = s.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("num1 is highest number");
        }else if(num2>num1 && num2>num3){
            System.out.println("num2 is highest number");
        }else{
            System.out.println("num3 is highest number");
        }

    }
}
