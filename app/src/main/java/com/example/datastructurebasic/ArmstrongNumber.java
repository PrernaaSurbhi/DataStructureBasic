package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 02/03/22.
 * program to print armstrong number
 *
 * enter int number: 121
 * armstrong number is  :36.0
 *
 * output
 * enter int number: 121
 * armstrong number is  :36.0
 */
public class ArmstrongNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter int number: ");
        int num = s.nextInt();
        int count = 0;
        double result = 0;

        while(num != 0){
            num = num/10;
            count++;
        }

        for(int i = 0 ; i<=count ; i++){
             result = result+Math.pow(i, count);
        }
        System.out.println("armstrong number is  :"+result);
    }


}
