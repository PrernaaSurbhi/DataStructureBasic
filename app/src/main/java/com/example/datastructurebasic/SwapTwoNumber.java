package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 28/02/22.
 * this program is to swipe two number with the help of temp vaibale.
 *
 * output--
 * enter 1st number before swap: 34
 * 1st number before swap is :34
 * enter 2nd number before swap: 22
 * 2nd number before swap is :22
 * first number after swap is :22
 * Second number after swap is: 34
 */

public class SwapTwoNumber {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("enter 1st number before swap: ");
        int num1 = s.nextInt();
        System.out.println("1st number before swap is :"+num1);

        System.out.print("enter 2nd number before swap: ");
        int num2 = s.nextInt();
        System.out.println("2nd number before swap is :"+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("first number after swap is :"+num1);
        System.out.print("Second number after swap is:  "+num2);


    }
}
