package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 28/02/22.
 *
 * this program is to take 2 integer by the user and print sum of it.
 * output ---
 * enter number 1: 10
 * 1st number enter by user is : 10
 * enter number 2: 30
 * 2nd number enter by user is : 30
 * sum of number is 40
 */
public class SumTwoNumbertAsInteger {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        System.out.print("enter number 1: ");
        int number1 = s.nextInt();
        System.out.println("1st number enter by user is : "+number1);

        System.out.print("enter number 2: ");
        int number2 = s.nextInt();
        System.out.println("2nd number enter by user is : "+number2);

        int sum = number1 + number2;
        System.out.println("sum of number is "+sum);
    }
}
